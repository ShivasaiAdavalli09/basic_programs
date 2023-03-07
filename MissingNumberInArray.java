package geekforGeeks;


//I/P arr[]={1,2,3,5},O/P is 4
//approach is n(n+1)/2-sum of all the array elements

public class MissingNumberInArray {

	static int getMissingNumber(int arr[]){
		
		int n=arr.length+1; //because we already know an element is missing,as for summation we have formula for n number of elements
		int sum=0;
		int sumation=n*(n+1)/2;
		int result;
		
		for(int i=0;i<n-1;i++){
			sum=sum+arr[i];
		}
		result=sumation-sum;
		
		return result;
	}
	
	public static void main(String args[]){
		
		int a1[]={1,2,3,5};
		int missNum=getMissingNumber(a1);
		System.out.print(missNum);
	}
}
