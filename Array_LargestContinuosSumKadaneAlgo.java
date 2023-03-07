package FINAL450_Array;

//int arr[]={-2,-3,4,-1,-2,1,5,-3}
//answer is  4+(-1)+(-2)+1+5=7(answer is 7)
//kadanes algo works when there is atleast one positive number,if all negative it wont work 
public class Array_LargestContinuosSumKadaneAlgo {

	private int kadaneLargestSumContig(int arr[]){
		
	    int max_so_far=Integer.MIN_VALUE;
	    int max_ending_here=0;
	    //if max_ending_here > max_so_far then update max_so_far with max_ending_here while iterating loop
	    //if max_so_far<0 update max_so_far to zero else positive update the positive number
	    for(int i=0;i<arr.length;i++){
	    	max_ending_here=max_ending_here+arr[i];
	    	if(max_ending_here<0)
	    		max_ending_here=0;
	    	if(max_so_far<max_ending_here)
	    		max_so_far=max_ending_here;
	    }
	    
		return max_so_far;
		}
	public static void main(String args[]){
		Array_LargestContinuosSumKadaneAlgo also=new Array_LargestContinuosSumKadaneAlgo();
		int b[]={-2,-3,4,-1,-2,1,5,-3};
		int res=also.kadaneLargestSumContig(b);
		System.out.print("largest continuos sum of array is"+" "+res);
	}
}
