package GeeksForGeeks_450_programs;

//Input  : arr[] = {1, 2, 3}
//Output : arr[] = {3, 2, 1}

//Input :  arr[] = {4, 5, 1, 2}
//Output : arr[] = {2, 1, 5, 4}

public class Array_reverse_2 {

	static void reverse(int arr[]){
		
		int temp;
		
		int start=0;
		int end=arr[arr.length-1]-1;
		
		while(start<end){
			
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	
	for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
	public static void main(String args[]){
		int arr[]={1,2,3,4,5};
		Array_reverse_2 ar1=new Array_reverse_2();
		ar1.reverse(arr);
		
	}
}
