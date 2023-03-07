package FINAL450_Array;


//this works only in ascending order and in sequence of numbers
public class Array_Reverse {

	private static void reverse(int arr[]){
		int temp;
		int start=0;
		int end=arr[arr.length-1]-1;
		
		while(start<end){
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String args[]){
		Array_Reverse ar=new Array_Reverse();
		int b[]={1,2,3,4,5};
		ar.reverse(b);
	}
}
