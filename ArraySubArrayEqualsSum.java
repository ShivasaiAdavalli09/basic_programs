package babbar_450_array;

//this applies for sum 0 or any sum, refer array pair for pair this is subarray
public class ArraySubArrayEqualsSum {

	private static void subArrEqSum(int arr[],int sum){
		
		
		for(int i=0;i<arr.length;i++){
			int currentSum=arr[i];
			if(currentSum==sum){
				System.out.println("sum found at index"+i);
			}
			else{
				for(int j=i+1;j<arr.length;j++){
					currentSum+=arr[j];
					if(currentSum==sum){
						System.out.println("sum found at index"+i+"and"+j);
					}
				}
			}
		}
		//System.out.println("no subarray");
	}
	public static void main(String args[]){
		int input[]={1,2,5,3,-1,-2}; //subarray means contiguos
		int sum=0;
		subArrEqSum(input,sum);
	}
}
