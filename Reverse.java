package programs;

import java.util.Scanner;

public class Reverse {
	
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
		System.out.println(reverse);
	}

}
