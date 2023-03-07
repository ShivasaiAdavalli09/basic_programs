package geekforGeeks;

public class CyclicArrayRotation {

	void cyclicRotate(int arr[]){
		
		//this is same as leftRotate logic used in LeftArrayRotation
		int n=arr.length;
		int temp=arr[n-1];
		
		for(int i=n-1;i>0;i--){
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}
	
	void printArray(int arr[]){
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String args[]){
		
		CyclicArrayRotation car=new CyclicArrayRotation();
		
		int arr[]={1,2,3,4,5};
		car.cyclicRotate(arr);
		car.printArray(arr);
	}
}
