package babbar_450_array;

//arr[0..n-1] represents sizes of
// packets. m is number of students.
// Returns minimum difference between
// maximum and minimum values of
// distribution.

//remember program as formula kind
//https://www.geeksforgeeks.org/chocolate-distribution-problem/
public class ArrayChocolateDistribution {

	private static int findMinDiff(int arr[],int m){
		
		int min_diff=Integer.MAX_VALUE;
		int diff;
		
		for(int i=0;i+m-1<arr.length;i++){
			diff=arr[i+m-1]-arr[i];
			if(diff<min_diff)
				min_diff=diff;
		}
		
		return min_diff;
	}
	public static void main(String args[]){
		int arr[]={12,4, 7,9,2,23,25,41,30,40,28,42,30,44,48,43,50};
		int m=7;
		System.out.println("minimum difference is"+findMinDiff(arr,m));
		
	}
}
