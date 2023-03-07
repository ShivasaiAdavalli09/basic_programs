package GeeksForGeeks_450_programs;

import java.util.Arrays;

//this is best and easiest approach
public class Array_MedianOf2SortDiffSize {

	public static void solution(int arr[]){
		
		int n=arr.length;
		
		// If length of array is even
		if(n%2==0){
			
			int z=n/2;
			int e=arr[z];
			int q=arr[z-1];
			
			int ans=(e+q)/2;
			
			System.out.println("the median is"+" "+ans);
		}
		
		// If length if array is odd
		else{
			int z=Math.round(n/2);
			System.out.println("the median is"+"  "+arr[z]);
		}
	}
	
	public static void main(String args[]){
		
		int arr1[]={-5,3,6,12,15};
		int arr2[]={-12,-10,-6,4,10};
		
		int i=arr1.length;
		int j=arr2.length;
		
		int arr3[]=new int[i + j];
		
		// Merge two array into one array
		System.arraycopy(arr1, 0, arr3, 0, i);
		System.arraycopy(arr2, 0, arr3, i, j);
		
		 // Sort the merged array
		Arrays.sort(arr3);
		
		solution(arr3);
	}
	
}
