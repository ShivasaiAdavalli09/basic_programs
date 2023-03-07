package babbar_450_array;

import java.util.Arrays;

//first sort and then find that some Kth min or max number
public class KthElementArray {

	private static int findKthMaxElem(int arr[],int k){
		int req=arr.length;
		while(k>0){
			req--;
			k--;
		}
		
		return arr[req];
		}
	
	private static int findKthMinElem(int arr[],int k){
		
		return arr[k-1];
	}
	public static void main(String args[]){
		
		int input[]={4,10,2,119,5,100};
		Arrays.sort(input);
		System.out.println("the 2nd min element is"+findKthMinElem(input,2));
		System.out.println("the 2nd max element is"+findKthMaxElem(input,2));
	}
}
