package programs;

import java.util.Scanner;

public class Prime {
	
	public static void main(String args[])
	{
		
		int n;
		System.out.println("enter the number to be checked\n");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		boolean isPrime=true;
		if(n==0||n==1)
			System.out.println("the give number"+n+"is not prime");
		else{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				isPrime=true;
		}
		if(isPrime)
			System.out.println("prime");
		else
			System.out.println(" not prime");
	}
	}
}
