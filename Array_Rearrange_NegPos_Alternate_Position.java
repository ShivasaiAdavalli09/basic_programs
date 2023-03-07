package babbar_450_array;

import java.util.Arrays;

public class Array_Rearrange_NegPos_Alternate_Position {

	private static void altNegPosPosition(int arr[]){
		
	  int i=-1;
	  int temp=0;
	  
	  for(int j=0;j<arr.length;j++){
		if(arr[j]<0){
			i++;
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
	  }
	  System.out.println("elements before this arranging");
	  for(int k:arr)
		  System.out.print(k+" ");
		  
	  //now i is position of last negative and now all negatives are at left side of i+1
	int pos=i+1,neg=0;//neg=0 since we want positive at first
	  while(pos<arr.length && neg<pos){
		  temp=arr[neg];
		  arr[neg]=arr[pos];
		  arr[pos]=temp;
          pos++;
          neg+=2;
	  }
	}
	public static void main(String args[]){
	int input[]={-1,-6,3,5,4,-10,13};
	altNegPosPosition(input);
	System.out.println("the elements of array are");
	for(int i:input)
		System.out.print(i+" ");
	}
}
