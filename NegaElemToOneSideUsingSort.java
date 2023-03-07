package babbar_450_array;

import java.util.Arrays;

public class NegaElemToOneSideUsingSort {

	public static void main(String args[]){
		
		int input[]={-1,-2,10,-5,-6,4,5,-3};
		System.out.println("Sorted array with negative elements in one side");
		Arrays.sort(input);
		for(int i:input)
			System.out.print(i+" ");
	}
}
