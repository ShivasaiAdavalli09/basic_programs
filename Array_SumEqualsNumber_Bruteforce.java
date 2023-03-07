package GeeksForGeeks_450_programs;

//for efficient one refer gfg https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
public class Array_SumEqualsNumber_Bruteforce {

	public static void checkPair(int arr[],int sum){
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==sum){
					System.out.println("the pairs are"+" "+arr[i]+" "+arr[j]);
				}
			}
		}
	}
	
	public static void main(String args[]){
		
		int a[]={1,2,3,6,5};
		int sum=11;
		
		checkPair(a,sum);
		
	}
}
