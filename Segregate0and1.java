package geekforGeeks;

//I/P arr[]={1,0,0,0,1,1,1,1} O/P arr[]={0.0.0,1,1,1,1,1}
//To segregate this 0s and 1s we count number of 0s or 1s and then put those 0s first and then 1s

public class Segregate0and1 {

	static void SegArr(int arr[]){
		
		int n=arr.length;
		int count=0;//to count number of zeroes
		
		for(int i=0;i<n;i++){
			if(arr[i]==0)
				count++;
		}
		
		//filling zeroes first in array first
		for(int i=0;i<count;i++)
			arr[i]=0;
		
		for(int i=count;i<n;i++)
			arr[i]=1;
		
		  
	}

	private static void print(int arr[]) {
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String args[]){
		
		int arr[]={1,0,0,0,1,1,1,1};
		SegArr(arr);
		print(arr);
		
	}
	
	
}
