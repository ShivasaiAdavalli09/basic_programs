package GeeksForGeeks_450_programs;

//Input  : arr[] = {1, 2, 3}
//Output : arr[] = {3, 2, 1}

//Input :  arr[] = {4, 5, 1, 2}
//Output : arr[] = {2, 1, 5, 4}

public class Array_reverse {

	
	static void reverse(int arr[]){
		
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		
		}
	
	public static void main(String args[]){
		
		int arry[]={1,2,3,4,5};
		Array_reverse ar=new Array_reverse();
		
		ar.reverse(arry);
		
	}
	
}
