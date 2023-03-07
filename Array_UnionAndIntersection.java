package FINAL450_Array;

import java.util.Arrays;
//also practice the hashmap approach once from gfg https://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/
public class Array_UnionAndIntersection {
//through out we should have same i globally so that we track left out items
	private void UnionArr(int arr1[],int arr2[]){
		int i=0,j=0,m=arr1.length,n=arr2.length;
		
		while(i<m && j<n){
			if(arr1[i]<arr2[j]){
				System.out.print(arr1[i++]+" ");
			}
			else if(arr2[j]<arr1[i]){
				System.out.print(arr2[j++]+" ");
			}
			else{
				System.out.print(arr2[j++]+" ");
				i++;
			}
		}
		//printing remaining elements of array
		while(i<m)
			System.out.print(arr1[i++]+" ");
		while(j<n)
			System.out.print(arr2[j++]+" ");
		}
	private void arraysIntersection(int arr1[],int arr2[]){
		int i=0,j=0,m=arr1.length,n=arr2.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);//because this algo wont work if numbers missarranged
		while(i<m && j<n){
		if(arr1[i]<arr2[j])
			i++;
		if(arr2[j]<arr1[i])
			j++;
		else{
			System.out.print(arr2[j++]+" ");
			//j++;
			i++;
		}
		}
	}
	public static void main(String args[]){
		Array_UnionAndIntersection aun=new Array_UnionAndIntersection();
		
		int b[]={1,7,2,6,5,10};
		int c[]={11,17,16,2,1,21};
		int d[]={45,32,28,89};
		int e[]={32,28,1,2,3};
		Arrays.sort(b);
		Arrays.sort(c);
		aun.UnionArr(b, c);
		System.out.println();
	    System.out.println("intersection");
		aun.arraysIntersection(d, e);
	}
}
