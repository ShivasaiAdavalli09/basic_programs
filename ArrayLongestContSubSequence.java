package babbar_450_array;

import java.util.Arrays;

// longest subsequence if input[]={1,9,3,10,4,20,2}.then O/P should be {1,2,3,4};
public class ArrayLongestContSubSequence {

	private static int countLongestSubsequence(int arr[]){
		
	Arrays.sort(arr);
		int count=0,ans=0;
		
		for(int i=1;i<arr.length;i++){
		if(arr[i]==arr[i-1]+1)
			count++;
		else
			count=1;
		//update maximum
		ans=Math.max(ans,count);
		}
		return ans;
	}
	public static void main(String args[]){
		int input[]={1,9,3,10,4,20,2};
		int out=countLongestSubsequence(input);
		System.out.println("the longest subseq"+" "+out);
	}
}
