package babbar_450_array;

//https://www.geeksforgeeks.org/three-way-partitioning-of-an-array-around-a-given-range/
public class ArrayThreeWayPartioning {

	private static void threeWayPartition(int arr[],int lowVal,int highVal){
		
		int n=arr.length;
		int start=0,end=n-1;
		
		for(int i=0;i<=end;)//because we will insert at end position also and decrement end
		{
			
			if(arr[i]<lowVal){
				int temp=arr[start];
				arr[start]=arr[i];
				arr[i]=temp;
				start++;
                i++;
			}
			else if(arr[i]>highVal){
				int temp=arr[end];
				arr[end]=arr[i];
				arr[i]=temp;
				end--;
			}
			else
				i++;
			
			
		}
	}
	public static void main(String args[]){
		int input[] = { 1,14,5,20,4,2,54,20,87,98,3,1,32};
		threeWayPartition(input,10,20);
		System.out.println("modified array\n");
		for(int i=0;i<input.length;i++)
			System.out.print(input[i]+" ");
	}
}
