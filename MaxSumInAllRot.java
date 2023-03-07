package geekforGeeks;


//Java program to find max value of i*arr[i]
//Rj-Rj-1=arrSum-n*arr[n-j] where n is arr.length
//https://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/

//static as we are directly calling maxSum() method in main without creating obeject

public class MaxSumInAllRot {

static int arr[]={10,1,2,3,4,5,6,7,8,9};

static int maxSum(){
	
	int arrSum=0;
	int currVal=0;
	
	for(int i=0;i<arr.length;i++){
		arrSum=arrSum+arr[i];
		currVal=currVal+(i*arr[i]);
	}
	//initialising max as currVal
	int maxVal=currVal;
	//now rotate and find max value
	
	for(int j=1;j<arr.length;j++){
		currVal=currVal+arrSum-arr.length*arr[arr.length-j];
		if(currVal>maxVal)
			maxVal=currVal;
		
	}
	//return maxVal
	return maxVal;
}
	public static void main(String args[]){
	
		/*MaxSumInAllRot msin=new MaxSumInAllRot();
		int value=msin.maxSum();
		System.out.println("the max value is"+" "+value);*/
		//or
		System.out.println("max sum i*arr[i] is:"+" "+maxSum());
	}
	

}
