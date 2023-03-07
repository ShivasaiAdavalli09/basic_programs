package udemy_practice;

public class BubbleSortPractice {
	
	
	
	public static void main(String args[]){
		
		int arr[]={100,40,1,2,9,98};
		
		for(int N=arr.length-1;N>0;N--){
			
			for(int i=0;i<N;i++){
				if(arr[i]>arr[i+1]){
					swap(arr,i,i+1);
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i==j){
			return;
		}
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
