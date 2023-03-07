package LeetCodePractice;

public class SumEqTarget2 {

	public static void main(String args[]){
		int nums[]={1,6,7,9};
		int target=8;
		for(int i=0;i<nums.length-1;i++){
			
			for(int j=i+1;j<nums.length;j++){
				
			
			int x=nums[i];
			int y=target-x;
			
			if(y==nums[j]){
				System.out.println("the elements are"+" "+x+" "+y);
				
			}
			}
		}
	}
}
