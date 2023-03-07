package FINAL450_Array;

import java.util.Arrays;

//Input: arr[] = {1, 5, 15, 10}, k = 3   
//Output: Maximum difference is 8, arr[] = {4, 8, 12, 7}
public class Array_maxDifferenceBetweenHeights {

	private int getMinDiff(int arr[],int k){
		Arrays.sort(arr);
		
		//maximum possible height difference
		int n=arr.length;
		int ans=arr[n-1]-arr[0];
		
		int tempMin,tempMax;
		tempMin=arr[0];
		tempMax=arr[n-1];
		for(int i=1;i<n;i++){
			//if on subracting we got negative then continue
			if(arr[i]-k<0)
				continue;
			// Minimum element when we add k to whole array
			tempMin=Math.min(arr[0]+k,arr[i]-k);
			//maximum element when we subract k from whole array
			tempMax=Math.max(arr[i-1]+k, arr[n-1]-k);
			ans=Math.min(tempMin, tempMin);
		}
		return ans;
		}
	public static void main(String args[]){
		Array_maxDifferenceBetweenHeights mdb=new Array_maxDifferenceBetweenHeights();
		int a[]={1,5,15,10};
		int k=3;
		int res=mdb.getMinDiff(a, k);
		System.out.print("the result is"+" "+res);
	}
}
