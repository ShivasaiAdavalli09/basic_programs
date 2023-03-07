package GeeksForGeeks_450_programs;

import java.util.Arrays;

//I/P arr[] = {1, 2, -3, 4, 5, 6, -7, 8, 9};
//O/P arr[]={ 4   -3    5   -1    6   -7    2    8    9};

public class Array_Rearrange_ToAltPos_NegNum {

	public static void reArrangeAltPosNeg(int arr[]){
		
		int i=-1,temp=0;
		//this step to bring all negative elements on left side of array
		for(int j=0;j<arr.length;j++){
			if(arr[j]<0){
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int pos=i+1,neg=0;
		int n=arr.length;
		
		while(pos<n && n<pos && arr[neg]<0){
			
			temp=arr[neg];
			arr[neg]=arr[pos];
			arr[pos]=temp;
			pos++;
			neg+=2;
		}
		//return arr;
		
		for(int k=0;k<n;k++){
			System.out.print(arr[k]+" ");
		}
	}
	public static void main(String args[]){
		
		int a[]={-1,2,-3,4,5,6,-7,8,9};
		reArrangeAltPosNeg(a);
		//System.out.print(Arrays.toString(p));
	}
	
}
