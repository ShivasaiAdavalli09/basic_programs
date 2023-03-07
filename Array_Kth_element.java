package GeeksForGeeks_450_programs;

import java.util.Arrays;

public class Array_Kth_element {

	static int kthSmallest(int arr[],int k){
		
		Arrays.sort(arr);
		
		return arr[k-1];
		
	}
	
	public static void main(String args[]){
		
		int arr[]={5,3,2,10,12,14};
		int k=2;
		int p=kthSmallest(arr,2);
		System.out.println("kth smallest element is"+" "+p);
		
	}
}
