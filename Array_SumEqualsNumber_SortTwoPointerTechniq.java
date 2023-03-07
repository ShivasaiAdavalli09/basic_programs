package GeeksForGeeks_450_programs;

import java.util.Arrays;

public class Array_SumEqualsNumber_SortTwoPointerTechniq {

	public static void checkPair(int arr[],int sum){
		
		Arrays.sort(arr);
		int l=0,r=arr.length-1;
		
		while(l<r){
			if(arr[l]+arr[r]==sum){
				System.out.println("the pairs are"+" "+arr[l]+" "+arr[r]);
				break;
			}
			else if(arr[l]+arr[r]<sum){
				l++;
			}
			else
				r--;
		}
	}
	public static void main(String args[]){
		int a[]={1,4,45,6,10,-8};
		int reqSum=14;
		checkPair(a,reqSum);
		
	}
}
