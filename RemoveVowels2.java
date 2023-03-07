package q4interview.programs;

import java.util.Scanner;

public class RemoveVowels2 {

	public static void main(String args[]){
		
		String str,result;
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		result=str.replaceAll("[aeiouAEIOU]", "");
		System.out.println("the vowels removed string is"+result);
	}
}
