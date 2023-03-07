package babbar_450_array;

public class Max_and_MinOfArray {

	private static int maxOfArray(int arr[]){
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
		}
	
	private static int minOfArray(int arr[]){
		
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
		}
	public static void main(String args[]){
		int inp[]={10,18,1,2,3,80};
		int out=maxOfArray(inp);
		System.out.println("max element"+" "+out);
		int mini=minOfArray(inp);
		System.out.println("min element"+" "+mini);
	}
}
