package programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringAnagramMain2 {

	public static void main(String args[]){
		
		String word="java2blog";
		String anagram="aj2vabgol";
		
		char[] str1=word.toCharArray();
		char[] str2=anagram.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		String s1=String.valueOf(str1);
		String s2=String.valueOf(str2);
		
		if(s1.equals(s2)){
			System.out.println("the strings are anagram");
		}
		else
		System.out.print("no");
	}
}
