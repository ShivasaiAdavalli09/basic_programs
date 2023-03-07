package babbar_450_array;

import java.util.Arrays;

public class ReverseArray {

	private static int[] reverse(int arr[]){
		
		//int input[]={10,1,3,7,5};
		int k=arr.length;
		int rev[]=new int[k];
		
		
		for(int i=0;i<arr.length;i++)
		{
			rev[k-1]=arr[i];
			k--;
		}
			return rev;
		}
	public static void main(String args[]){
		
		int arrayInp[]={10,5,1,3,4};
		//ReverseArray reve=new ReverseArray();
		//reve.reverse(arrayInp);//if dont want method be static then use object else drctly static n use method
		int out[]=reverse(arrayInp);
		System.out.println("the output is"+Arrays.toString(out));
		System.out.println("output using for loop");
		for(int i=0;i<out.length;i++)
			System.out.print(out[i]+" ");
		System.out.println();
		for(Integer o:out){
			System.out.print(o+" ");
		}
		System.out.println();
		for(int o:out){
			System.out.print(o+" ");
		}
	}
	
}
