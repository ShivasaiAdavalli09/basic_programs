package FINAL450_Array;

import java.util.Iterator;

public class Array_Reverse_best {

	private void reverse(int arr[]){
		
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(" "+arr[i]);
	}
	
	/*private int[] reverseByIterator(int ar[]){
		Iterator<I
		return ar;
		
	}*/
	
	public static void main(String args[]){
		Array_Reverse_best arb=new Array_Reverse_best();
		int b[]={3,2,9,6,7};
		arb.reverse(b);
	}
	
}
