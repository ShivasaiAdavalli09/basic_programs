package babbar_450_array;

//find sumpairs possible
//approach by binary search and hashmap approachis important should practice
public class ArrayPairEqualsSumBruteForce {

	private static int findSumPair(int arr[],int sum_value){
		int pairsCount=0;
		int currentSum;
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				currentSum=arr[i]+arr[j];
				if(currentSum==sum_value){
				pairsCount++;
				}
			}
		}
		
	return pairsCount;
	}
	public static void main(String args[]){
		int input[]={1,5,7,1};
		int requiredSum=6;
		int output=findSumPair(input,requiredSum);
		System.out.println("the number of pairs"+" "+output);
	}
}
