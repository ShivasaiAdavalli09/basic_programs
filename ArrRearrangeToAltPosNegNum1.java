package GeeksForGeeksPractice;


//https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers-publish/
public class ArrRearrangeToAltPosNegNum1 {

	static void rearrange(int arr[]){
		
		int n=arr.length;
		int i=-1,temp=0;
		for(int j=0;j<n;j++){
			if(arr[j]<0){
				i++;
			   temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
			}//now all negative elements are left and positive on right
		}
		//that is negative numbers above are till i
		int pos=i+1,neg=0;
		
		while(pos<n && neg<pos && arr[neg]<0){
			
			temp=arr[neg];
			arr[neg]=arr[pos];
			arr[pos]=temp;
			neg+=2;
			pos++;
		}
	}
	
	static void printArray(int arr[]){
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	
	public static void main(String args[]){
		
		int arr[]={-1,-2,-3,4,5,6,-7,8,9};
		rearrange(arr);
		printArray(arr);
		
	}
}
