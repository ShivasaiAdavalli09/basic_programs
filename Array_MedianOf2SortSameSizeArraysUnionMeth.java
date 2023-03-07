package GeeksForGeeks_450_programs;

import java.util.Arrays;

//follow this approach
//https://www.geeksforgeeks.org/median-of-two-sorted-arrays/
public class Array_MedianOf2SortSameSizeArraysUnionMeth {

	public static void getMedian(int arr1[],int arr2[]){
		
		int n=arr1.length; //arr1,arr2 are same size
		
		int j=0;
		int i=n-1;
		
		while(arr1[i] > arr2[j] && j<n && i>-1){
			
			int temp=arr1[i];
			arr1[i]=arr2[j];
			arr2[j]=temp;
			i--;
			j++;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//since sum of two odd or two even numbers is always even,hence at every case it is even number of elements
		System.out.print("the median is"+"  "+(arr1[n-1]+arr2[0])/2);
	}
	
	public static void main(String args[]){
		int a1[]={1,12,15,26,38};
		int a2[]={2,13,17,30,45};
		
		int n1=a1.length;
		int n2=a2.length;
		
		if(n1==n2)
			getMedian(a1,a2);
		else
			System.out.println("the arrays are not equal size");
	}
	
}
