package GeeksForGeeks_450_programs;

import java.util.Arrays;

public class Array_Merge_SortedArrays_withNoExtraSpace {

	static void merge(int a1[],int a2[]){
		
		int n=a1.length;
		int m=a2.length;
		
		int i=0,j=0,k=n-1;
		
		while(i<=k&&j<m){
			if(a1[i]<a2[j])
				i++;
			else{
				int temp=a2[j];
				a2[j]=a1[k];//we are swapping last element because its sorted so all elements in a1 shoul be less so sort with last elementof a1 with 1st of a2 in else
				a1[k]=temp;
				k--;
				j++;
				
			}
		}
		Arrays.sort(a1);
		Arrays.sort(a2);
	}
	public static void main(String args[]){
		int arr1[]={1,5,9,10,15,20};
		int arr2[]={2,3,8,13};
		merge(arr1,arr2);
		System.out.println("the first array is");
		System.out.println(Arrays.toString(arr1));
		System.out.println("the second array is");
		System.out.println(Arrays.toString(arr2));
	}
	
}
