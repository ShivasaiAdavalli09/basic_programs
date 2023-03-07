package babbar_450_array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayPrintOnly {

	private static void reverseArr(int arr[]){
		
		
		for(int i=arr.length-1;i>=0;i--)
			System.out.println(arr[i]+" ");
			}
	
	public static void main(String args[]){
		
		
		System.out.print("enter the number of elements");
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int input[]=new int[n];
		System.out.print("enter the elements");
		for(int i=0;i<n;i++){
			input[i]=in.nextInt();
		}
		System.out.print("entered elements are"+Arrays.toString(input));
		System.out.print("the elements are");
		reverseArr(input);
	}
}
