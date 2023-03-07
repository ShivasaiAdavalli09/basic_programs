package programs;

import java.util.Scanner;

public class Palindrome {
	
	
	public static void main(String args[])
	{
		
		
		int n,sum=0,a,temp;
		System.out.println("enter the number to be checked palindrome");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		temp=n;
		while(n>0)
		{
			a=n%10;
			sum=(sum*10)+a;
			n=n/10;
			
		}
		if(temp==sum)
			System.out.println("the given number"+sum+" is palindrome\t");
		else
			System.out.println("not");
		
	}

}
