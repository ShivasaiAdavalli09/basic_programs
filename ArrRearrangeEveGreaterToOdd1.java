package geekforGeeks;

import java.util.Arrays;

//follow this appraoch
//https://www.geeksforgeeks.org/rearrange-array-such-that-even-positioned-are-greater-than-odd/

//here we will take a new array and copy there the changes(thum rule new array because we have else condition,for else mostly use new array
public class ArrRearrangeEveGreaterToOdd1 {

	static void reArrange(int arr[]){
		int n=arr.length;
		
		Arrays.sort(arr);
		int res[]=new int[n];
		int p=0,q=n-1;
		
		for(int i=0;i<n;i++){
			//assign max values to even
			if((i+1)%2==0)
				res[i]=arr[q--];
			else
			//min values to odd
			    res[i]=arr[p++];
			}
		
	 
		 for(int i=0;i<res.length;i++)
			 System.out.print(res[i]+" ");
		 
	}
	 public static void main(String args[]){
		 int arr[]={1,2,3,4,5,6,7};
		 reArrange(arr);
		 
	 }
}
