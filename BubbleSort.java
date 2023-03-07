package SortandSearching;

import java.util.Scanner;

public class BubbleSort {
	
	static void bubble(int[] arr)
	{
		int n=arr.length;
		int temp;
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		int a[] =new int[5];
			
		System.out.println("enter the elements");
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++)
			a[i]=in.nextInt();
		bubble(a);
		System.out.println("after sort");
		for(int i=0;i<5;i++)
		System.out.println(a[i]);
	}
}
