package babbar_450_array;

public class ArrayTripletToSum {

	private static boolean findThreeNumbers(int arr[],int sum){
		
		for(int i=0;i<arr.length-2;i++){
			for(int j=i+1;j<arr.length-1;j++){
				for(int k=j+1;k<arr.length;k++){
					if(arr[i]+arr[j]+arr[k]==sum){
                    	System.out.println("triplet is"+" "+arr[i]+" "+arr[j]+" "+arr[k]);
                    	return true;
					}
				}
			}
		}
		
		return false;
	}
	public static void main(String args[]){
		int A[] = {1,4,45,6,10,8};
		int sum=22;
		findThreeNumbers(A,sum);
	}
}
