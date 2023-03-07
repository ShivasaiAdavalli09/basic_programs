package GeeksForGeeks_450_programs;

public class Array_FindDuplicate_Array_brute_force {

	public static void main(String args[]){
		int[] arr={1,2,4,6,7,6,5,9};
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]==arr[j]){
				System.out.println("the duplicate element is"+arr[j]);	
			}
		}
	}
}
