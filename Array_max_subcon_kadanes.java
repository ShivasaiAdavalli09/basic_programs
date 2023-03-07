package GeeksForGeeks_450_programs;

public class Array_max_subcon_kadanes {

	static int maxSubArray(int a[]){
		
		int max_so_far=Integer.MIN_VALUE;
		int n=a.length;
		int max_ending_here=0;
		
		for(int i=0;i<n;i++){
			max_ending_here=max_ending_here+a[i];
			
			if(max_so_far<max_ending_here)
				max_so_far=max_ending_here;
			if(max_ending_here<0)
				max_ending_here=0; //because sum would be negative again if we consider the negative value,hence make it zero and satrt again from loop there
		}
		return max_so_far;
	}
	
	public static void main(String args[]){
		int arr[]={-2,-3,4,-1,-2,1,5,-3};
		
		int result=maxSubArray(arr);
		System.out.print(result);
	}
	
}
