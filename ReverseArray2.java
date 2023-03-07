package geekforGeeks;

//https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
//doing reverse of array by swapping method

public class ReverseArray2 {

	static void reverse(int arr[]){
		
		int start=0;
		int end=arr.length-1;
		int temp;
		
		while(start<end){
			temp=start;
			start=end;
			end=temp;
			start++;
			end--;
		}
		print(arr);
	}
	
	static void print(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String args[]){
		int a1[]={5,4,3,2,1};
		reverse(a1);
	}
}
