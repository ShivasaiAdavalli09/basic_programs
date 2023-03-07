package geekforGeeks;

import java.util.Arrays;

//https://www.geeksforgeeks.org/rearrange-array-order-smallest-largest-2nd-smallest-2nd-largest/

//Input : arr[] = [5, 8, 1, 4, 2, 9, 3, 7, 6]
//Output :arr[] = {1, 9, 2, 8, 3, 7, 4, 6, 5}

//Input : arr[] = [1, 2, 3, 4]
//Output :arr[] = {1, 4, 2, 3}

public class ArrRearrangeLarSmallSecLargeSecSmall {

	static void reArrange(int arr[]){
		
		Arrays.sort(arr);
		
		int n=arr.length;
		int[] resArr=new int[n];//whenever there is modification we should store array to a new array
		
		
		
		int index=0;
		for(int i=0,j=n-1;i<=n/2||j>n/2;i++,j--){
			if(index<n){
				resArr[index]=arr[i];
				index++;
			}
			
			if(index<n){
				resArr[index]=arr[i];
				index++;
			}
			
			}
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String args[]){
		
		int arr[]={1,4,3,2};
		reArrange(arr);
		
	}
}
