package GeeksForGeeks_450_programs;

//leet code source code
//refer ayushi sharma video for more clarification
import java.util.Arrays;

public class Array_Next_Permutation {

	public static void nextPermutation(int nums[]){
		
		int i=nums.length-2;
		while(i>=0 && nums[i+1]<=nums[i]){
			i--;
		}
		if(i>=0){
			int j=nums.length-1;
			while(nums[j]<=nums[i]){
				j--;
			}
			swap(nums,i,j);
		}
		reverse(nums,i+1);
	}

	private static void reverse(int[] nums, int start) {
		int i=start;
		int j=nums.length-1;
		while(i<j){
			swap(nums,i,j);
			i++;
			j--;
		}
	}

	private static void swap(int[] nums, int i, int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	public static void main(String args[]){
		
		int a[]={3,1,4,2};
		//int b[]={4,1,5,3,2};
		nextPermutation(a);
		//nextPermutation(b);
		System.out.print(Arrays.toString(a));
		//System.out.print(Arrays.toString(b));
	}
}
