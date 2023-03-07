package geekforGeeks;

//Reverse algo is more efficient for this


public class LeftArrayRotation {

	
	//we can also run prog by not creating object here but for that methods should be static hence find here and for sample purpose I had put that for printArray
	/*static*/ 
	//or instead we pass n we can find arr.length and do 
	void leftRotate(int arr[],int d,int n){
		for(int i=0;i<d;i++){
			leftRotateByOne(arr,n);
		}
	}

	/* static*/ void leftRotateByOne(int[] arr, int n) {
		int i,temp;
		temp=arr[0];
		for(i=0;i<n-1;i++){
			arr[i]=arr[i+1];
		}
			arr[n-1]=temp;
		
		
	}
	 
	  void printArray(int arr[],int n){
		 for(int i=0;i<n;i++){
			 System.out.print(arr[i]+" ");
		 }
	 }
	 
	 public static void main(String args[]){
		 
		 LeftArrayRotation lar=new LeftArrayRotation();
		 int arr[]={1,2,3,4,5,6,7};
		 
		 lar.leftRotate(arr, 2, 7);
		 //printArray(arr,7);
		  lar.printArray(arr,7);
	 }
}
