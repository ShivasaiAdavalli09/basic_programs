package programs;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String args[])
	{
		String str,reverse="";
		System.out.println("enter the string");
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
		reverse=reverse+str.charAt(i);	
		}
		if(str.equals(reverse))
		System.out.println("the string is palindrome"+reverse);
		
		else
			System.out.println("the string is not palindrome");
		
	}

}
