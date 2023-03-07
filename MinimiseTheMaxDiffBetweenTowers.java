package babbar_450_array;

import java.util.Arrays;

//https://www.geeksforgeeks.org/minimize-the-maximum-difference-between-the-heights/
public class MinimiseTheMaxDiffBetweenTowers {

	private static int MinimiseHeight(int arr[],int k){
		
		Arrays.sort(arr);
		int n=arr.length;
		//max possible height difference
		int ans=arr[n-1]-arr[0];
		int tempMin=0;
		int tempMax=arr[n-1];
		
		//we need to assign i=1 because if we observe line 25 if i=0 then Math.min both the elements would be same hence thats why
		for(int i=1;i<n;i++){

            // if on subtracting k we got negative then
            // continue
			if(arr[i]-k<0)
				continue;
			// Minimum element when we add k to whole array
			tempMin=Math.min(arr[0]+k,arr[i]-k);
			// Maximum element when we subtract k from whole
            // array
			tempMax=Math.max(arr[i-1]+k,arr[n-1]-k);
			ans=Math.min(ans,tempMax-tempMin);
		}
			
		return ans;
	}
	public static void main(String args[]){
		
		//given array and value of k=6
		//value of k is required so that arr[i] is not less than k and also add and trial using k
		int input[]={1,15,10};
		int out=MinimiseHeight(input,6);
		System.out.println("output is"+" "+out);
	}
}
