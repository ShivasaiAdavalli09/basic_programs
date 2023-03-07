package geekforGeeks;

public class ArrZeroesToEnd {

	static void reArrange(int arr[]){
		
		int n=arr.length;
		
		int count=0;
		
		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				arr[count++]=arr[i];
			}
		}
			while(count<n){
				arr[count++]=0;
			}
		
		}
	static void print(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String args[]){
		int ar[]={1,2,-3,0,9,0,8,7,0,0};
		reArrange(ar);
		print(ar);
	}
}
