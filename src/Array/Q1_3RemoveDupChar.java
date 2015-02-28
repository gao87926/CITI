package Array;

public class Q1_3RemoveDupChar {

	public static String sort(String s){
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		System.out.println(content);
		return new String(content);		
	}
	public static boolean permutation(String s, String t){
		if(s.length()!=t.length())return false;
		return sort(s).equals(sort(t));
	}
	public boolean permutation1(String s, String t){
		if(s.length()!=t.length())return false;
		int[] letters= new int[256];
		char[] sArray=s.toCharArray();
		for(char c:sArray ){
			letters[c]++;
		}
		for(int i=0;i<t.length();i++){
			int c = (int)t.charAt(i);
			if(--letters[c]<0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
