package Array;

import java.util.Arrays;

public class Q1_1UniqString {
//	Implement an algorithm to determine if a string has all unique characters. 
	//What if you can not use additional data structures?
	public static boolean isUnique1(String s){
		boolean[] result= new boolean[256];
		Arrays.fill(result, false);
		char[] arrayStr= s.toCharArray();
		for(int i=0;i<arrayStr.length;i++){
			int c = (int)arrayStr[i];
			System.out.println(arrayStr[i]);
			if(result[c]==false){
				result[c]=true;
			continue;}
			if(result[c]==true){return false;}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUnique1("feeg"));
	}

}
