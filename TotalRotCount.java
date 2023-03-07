package geekforGeeks;
//Java program to find number of
//rotations in a sorted and rotated
//array.   
//that is we should know no of rotations needed to make it to increasing order also known as initial thing

//input {9,10,1,2,3,4,5} output 2

public class TotalRotCount {

	static int countRot(int arr[]){
		
		int n=arr.length;
		int min_index=-1;
		int min=arr[0];
		
		for(int i=0;i<n;i++){
			
			if(min>arr[i]){
				min=arr[i];
				min_index=i;
			}
		}
		
		return min_index;
		
	}
	
	public static void main(String args[]){
		int arr1[]={9,10,1,2,3,4,5};
		
		System.out.println("the number of rotations:"+" "+countRot(arr1));
		
	}
}
