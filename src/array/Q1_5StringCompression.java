package array;

public class Q1_5StringCompression {
//string "aabbccccaaa" to a2b1c5a3
	public static String compressBetter(String str){
	
		int size = countCompression(str);
		if(size>=str.length())return str;
		StringBuffer mystr= new StringBuffer();
		char last = str.charAt(0);
		int count =1;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==last){
				count++;
			}else{
				mystr.append(last);
				mystr.append(count);
				last=str.charAt(i);
				count=1;
				
			}
			
		}
		mystr.append(last);
		mystr.append(count);
		
		return mystr.toString();
	}
	public static int countCompression(String str){
		if(str==null||str.isEmpty())return 0;
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for(int i=1; i<str.length();i++){
			if(str.charAt(i)==last)count++;
			else{
				last=str.charAt(i);
				size +=1+String.valueOf(count).length();
				count=1;
			}
		}
		size+=1+String.valueOf(count).length();
		return size;
	}
	static int setChar(char[] array, char c, int index, int count){
		array[index]=c;
		index++;
		char[] cnt = String.valueOf(count).toCharArray();
		//copy character from biggest digit to smallest
		for(char x:cnt){
			array[index]=x;
			index++;
		}
		return index;
	}
	public static String compressAlternate(String str){
		int size = countCompression(str);
		if(size>=str.length())return str;
		char[] array= new char[size];
		int index=0;
		char last = str.charAt(0);
		int count =1;
		for(int i=1; i<str.length();i++){
			if(str.charAt(i)==last){
				count++;
			}else{
				index= setChar(array,last, index, count);
				last= str.charAt(i);
				count =1;
			}
		}
		index=setChar(array,last,index,count);
		return String.valueOf(array);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compressAlternate("abcccccaa"));
		System.out.println(compressBetter("abcccccaa"));
	}

}
