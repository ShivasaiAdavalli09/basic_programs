package FINAL450_Array;

import java.util.Arrays;

public class Array_KthsmallestelementandLargest {

	private int kthsmallest(int arr[],int k){
		Arrays.sort(arr);
		return arr[k-1];
		}
		//kth smallest and largest are both same here because in sorted array its same only
	/*private int kthlargest(int arr[],int k){
		Arrays.sort(arr);
		return arr[k-1];
		
	}*/
	
	public static void main(String args[]){
		Array_KthsmallestelementandLargest aks=new Array_KthsmallestelementandLargest();
		int b[]={6,3,2,9,1};
		int smallNum=3;
		int req=aks.kthsmallest(b,smallNum);
		System.out.println("the kth smallest element is"+" "+req);
	}
}
