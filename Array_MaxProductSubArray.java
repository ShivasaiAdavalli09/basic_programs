package GeeksForGeeks_450_programs;

//https://www.techiedelight.com/find-maximum-product-subarray-given-array/
public class Array_MaxProductSubArray {

	static int findMaxProduct(int arr[]){
		
		// base case
		if(arr.length==0){
			return 0;}
		// maintain two variables to store the maximum and minimum product
        // ending at the current index
		int max_ending=arr[0],min_ending=arr[0];
		
		// to store the maximum product subarray found so far
		int max_so_far=arr[0];
		
		//traversing the given array
		for(int i=1;i<arr.length;i++){
			int temp=max_ending;
			
			//update the maximum product ending at the current index
			max_ending=Integer.max(arr[i],Integer.max(arr[i]*max_ending, arr[i]*min_ending));
			
			// update the minimum product ending at the current index
			//here we use temp because we can use max_ending but it will fetch the one from above result not before we initialised hence using temp for that sole reason
			min_ending=Integer.min(arr[i],Integer.min(arr[i]*temp, arr[i]*min_ending));
			
			//because we are looking for max product in this program
			max_so_far=Integer.max(max_so_far,max_ending);
			
		}
		
		return max_so_far;
		
	}
	public static void main(String args[]){
	
		int a[]={-6,4,-5,8,-10,0,8};
		int p=findMaxProduct(a);
		System.out.print("the max product subarray is"+" "+p);
	}
	
	
}
