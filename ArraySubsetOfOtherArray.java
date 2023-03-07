package babbar_450_array;

import java.util.Arrays;

public class ArraySubsetOfOtherArray {

	private static boolean arraySubsetArray(int arr1[],int arr2[]){
		//int m=arr1.length,n=arr2.length;
		int i=0,j=0;
		int m=arr1.length,n=arr2.length;
		while(m<n)
			return false;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		while(i<m && j<n){
			if(arr1[i]<arr2[j])
				j++;
			else if(arr1[i]==arr2[j]){
				i++;
				j++;
			}
			else if(arr1[i]>arr2[j])
				return false;
		}
		return true;
	}
	public static void main(String args[]){
		int arr1[]={11,1,13,21,3,7};
		int arr2[]={11,3,7,1};
		if(arraySubsetArray(arr1,arr2)){
			System.out.println("arr2 is subset of arr1");
		}
		else
			System.out.println("arr2 is not subset of arr1");
		
	}
}
