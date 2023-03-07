package FINAL450_Array;

import java.util.Arrays;

public class Array_MoveAllNegNumOneSideUsingSort {

	private int[] sortNegFirst(int arr[]){
		//sorting automatically sorts 
		Arrays.sort(arr);
		return arr;
		}
	public static void main(String args[]){
		Array_MoveAllNegNumOneSideUsingSort ast=new Array_MoveAllNegNumOneSideUsingSort();
		int b[]={3,-8,9,0,-1,-2,-5};
		b=ast.sortNegFirst(b);
		for(int e:b)
			System.out.print(e+" ");
	}
}
