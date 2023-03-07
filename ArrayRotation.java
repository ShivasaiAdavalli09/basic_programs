package babbar_450_array;

public class ArrayRotation {

	private static void rotateArray(int arr[],int d){
		for(int i=0;i<d;i++)
			rotateArrayByOne(arr);
	}

	private static void rotateArrayByOne(int arr[]) {
		int temp=arr[0];
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
	}
	public static void main(String args[]){
		int input[]={1,2,3,4,8,7};
		System.out.println("rotate array by 1");
		rotateArray(input,1);
		for(int i:input)
			System.out.print(i+" ");
		System.out.println("rotate array by 2");
		rotateArray(input,2);
		for(int i:input)
			System.out.print(i+" ");
	}
}
