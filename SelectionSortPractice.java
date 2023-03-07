package udemy_practice;

public class SelectionSortPractice {
	
	public static void main(String args[]){

	int arr[]={200,100,7,9,10};
	
	
	for(int N=arr.length-1;N>0;N--){
		int largest=0;
		for(int i=1;i<=N;i++){
			if(arr[i]>arr[largest]){
				largest=i;
			}
		}
		swap(arr,largest,N);
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
