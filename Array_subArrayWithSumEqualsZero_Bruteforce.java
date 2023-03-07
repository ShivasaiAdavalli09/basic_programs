package GeeksForGeeks_450_programs;

// the link is https://www.techiedelight.com/find-sub-array-with-0-sum/

public class Array_subArrayWithSumEqualsZero_Bruteforce {

	public static void printAllSubArrays(int arr[]){
		
		//i.e we compare all the cases with i=0,then j=0,1,2,3.... and then i=1,then j=1,2,3...... i.e i=j
		for(int i=0;i<arr.length;i++){
			int sum=0;
			
			//consider all subarrays ending with j
			for(int j=i;j<arr.length;j++){
				
				//sum of elements so far
				sum+=arr[j];
				
				if(sum==0){
					System.out.println("Subarray ["+i+" "+j+"]");
					for(int k=i;k<=j;k++)
						System.out.print(arr[k]+" ");
					System.out.println();
				}
			}
		}
	}
	public static void main(String args[]){
		
		int a[]={3,4,-7,3,1,3,1,-4,-2,-2};
		printAllSubArrays(a);
	}
}
