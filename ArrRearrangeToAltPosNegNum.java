package geekforGeeks;

//I/P arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
//O/P arr[]={ 4   -3    5   -1    6   -7    2    8    9};

public class ArrRearrangeToAltPosNegNum {

	static void rearrange(int arr[],int n){
		
		int i=-1,temp=0;
		//this step we are moving all negative numbers to left
		for(int j=0;j<n;j++){
			
			if(arr[j]<0){
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//as we know till i we have negative numbers and from i+1 all positives
		int pos=i+1,neg=0;
		
		//can add neg<pos also as one more condition in while
		while(pos<n && arr[neg]<0){
			
			temp=arr[neg];
			arr[neg]=arr[pos];
			arr[pos]=temp;
			pos++;
			neg+=2;
		}
	}
	
	static void printArray(int arr[],int n){
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String args[]){
		
		int arr[]={-1,2,-3,4,5,-6,-7,8,9};
		int n=arr.length;
		rearrange(arr,n);
		System.out.println("Array after rearranging");
		printArray(arr,n);
		}
}
