package udemy_practice;

public class InsertionSortPractice {

public static void main(String args[]){
	
	int arr[]={100,80,120,7,8};

	for(int N=1;N<arr.length;N++){
		int newElement=arr[N];
		
		int i;
		for(i=N;i>0 && arr[i-1]>newElement;i--){
			arr[i]=arr[i-1];
		}
		arr[i]=newElement;
	}
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}
}
	