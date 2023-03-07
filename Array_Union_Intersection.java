package babbar_450_array;

import java.util.Arrays;

//always sort arrays for this logic to work
//always remember use else if wisely if not i checks if and directly go else instead of going to next if
public class Array_Union_Intersection {

	private static void arrayUnion(int arr1[],int arr2[]){
		int i=0,j=0,m=arr1.length,n=arr2.length;
		//sort arrays
		while(i<m && j<n){
		if(arr1[i]<arr2[j])
			System.out.print(arr1[i++]+" ");
		else if(arr2[j]<arr1[i])
			System.out.print(arr2[j++]+" ");
		else{
			System.out.print(arr2[j++]+" ");
			i++;
		}
		}	
		
		//printing remaining elements
		while(i<m)
			System.out.print(arr1[i++]+" ");
		while(j<n)
			System.out.print(arr2[j++]+" ");
	}
	private static void arrayIntersection(int arr1[],int arr2[]){
		int i=0,j=0,m=arr1.length,n=arr2.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(arr1[i]<arr2[j])
			i++;
		else if(arr2[j]<arr1[i])
			j++;
		else{
			System.out.print(arr1[i++]+" ");
			j++;
		}
	}
	public static void main(String args[]){
		int input1[]={1,5,2,8,6,9};
		int input2[]={9,17,15,11,10,18,19};
		Arrays.sort(input1);
		Arrays.sort(input2);
		arrayUnion(input1,input2);
		System.out.println();
		System.out.println("intersection of array");
		arrayIntersection(input1,input2);
	}
}
