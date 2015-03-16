package array;

public class Q1_8IsStringRotation {

	public static boolean isRotation(String s1, String s2){
		if(s1.length()!=s2.length()||s1.length()<0)return false;
		
			String ss = s1+s2;
			return ss.contains(s2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isRotation("abcdefg","fgabcde"));
	}

}
