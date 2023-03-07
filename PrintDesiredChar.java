package q4interview.programs;

import java.util.Scanner;

public class PrintDesiredChar {

	public static void main(String args[]){
		
		String str="whats my raashi";
		char ch;
		System.out.println("Enter the character to be searched");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0); //because we need only one character that is first entered
		int position=str.indexOf(ch);
		System.out.println("the entered character is found at"+" "+position);
	}
}
