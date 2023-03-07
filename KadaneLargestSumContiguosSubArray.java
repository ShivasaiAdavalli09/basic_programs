package babbar_450_array;

public class KadaneLargestSumContiguosSubArray {

//max_so_far,max_ending_here
//max_so_far is result and max_ending_here if less than zero then assign to zero	
	private static int largeSumContiguos(int arr[]){
		int max_so_far=Integer.MIN_VALUE;
		int max_ending_here=0;
		
		for(int i=0;i<arr.length;i++){
			max_ending_here=max_ending_here+arr[i];
			if(max_ending_here>max_so_far){
				max_so_far=max_ending_here;
			}
			if(max_ending_here<0)
				max_ending_here=0;
		}
		return max_so_far;
	}
	public static void main(String args[]){
		int input[]={ -2, -3, 4, -1, -2, 1, 5, -3 };
		int result=largeSumContiguos(input);
		System.out.println("max contiguos sum sub array"+" "+result);
	}
}
