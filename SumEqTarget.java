package LeetCodePractice;

//this is brute force approach
public class SumEqTarget {

	public static void main(String args[]){
		
		int nums[]={1,7,4,3};
		int target=7;
		
		for(int i=0;i<nums.length-1;i++){
			
			for(int j=i+1;j<nums.length;j++){
				
				int result=nums[i]+nums[j];
				if(target==result)
					System.out.println("the elements are"+" "+nums[i]+ " "+"and"+" "+nums[j]);
			}
		}
	}
}
