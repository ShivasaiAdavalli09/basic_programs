package babbar_450_array;

public class ArraySubArrayMaxMultiply {

	private static int maxMul(int arr[]){
		
		int result=arr[0];
        for(int i=0;i<arr.length;i++){
        	int mul=arr[i];
        	for(int j=i+1;j<arr.length;j++){
        		//result=Math.max(result,mul);
        		mul*=arr[j];
        	}
        	result=Math.max(result,mul);
        }
		return result;
	}
	
	public static void main(String args[]){
		int input[]={1,-2,-3,0,7,-8,-2};
		int out=maxMul(input);
		System.out.println("output is"+out);
	}
}
