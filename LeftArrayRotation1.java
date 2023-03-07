package geekforGeeks;

//https://www.geeksforgeeks.org/array-data-structure/#introduction
//Array rotation by reverse algo with O(n) complexity

public class LeftArrayRotation1 {

	void leftRotate(int arr[],int d){
		
		if(d==0)
			return;
		
		int n=arr.length;
		//in case if d>n and also fine if d<n as it guves same value//we can skip this step if want as only for d>n it should be imp
		d=d%n;
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,n-1);
		reverseArray(arr,0,n-1);
	}

	 void reverseArray(int[] arr, int start, int end) {
		
		int temp;
		while(start<end){
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
	}
	 void printArray(int arr[]){
		 for(int i=0;i<arr.length;i++)
			 System.out.print(arr[i]+" ");
		 }
	 
	 public static void main(String args[]){
		 
		 LeftArrayRotation1 la=new LeftArrayRotation1();
		 int arr[]={1,2,3,4,5,6,7};
		 la.leftRotate(arr,2);
		 la.printArray(arr);
		 
		 
	 }
}
