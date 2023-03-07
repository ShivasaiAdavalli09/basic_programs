package babbar_450_array;

import java.util.Arrays;

//explore other algos as well https://www.geeksforgeeks.org/merge-two-sorted-arrays-o1-extra-space/
//if arr1,arr2 not sorted sort first and then invoke logic
//compare arr1 last element with arr2 first ,should be greater then
//compare the arr[i] elements with arr2[0] if arr[i]>arr[0] then swap and then sort arr2,arr1 is already sorted and not needed
public class ArrayMergeWithoutSpace {

	private static void MergeWithoutSpace(int arr1[],int arr2[]){
		int i=0;
		int temp;
		int m=arr1.length;
		int n=arr2.length;
		
		while(arr1[m-1]>arr2[0]){
			if(arr1[i]>arr2[0]){
				temp=arr1[i];
				arr1[i]=arr2[0];
				arr2[0]=temp;
				Arrays.sort(arr2);
			}
			i++;
		}
	}
		public static void main(String args[]){
			
			int arr1[]={1,4,6,8,10};
			int arr2[]={2,3,5,9,12,13};
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			MergeWithoutSpace(arr1,arr2);
		   System.out.println("arrays after logic\n");
		   System.out.println("arr1\n");
		   for(int p:arr1)
			   System.out.print(p+" ");
		   System.out.println("arr2\n");
		   for(int p:arr2)
			   System.out.print(p+" ");
	}
}
