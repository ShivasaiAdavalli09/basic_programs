package FINAL450_Array;

//first reverse assign previous element to current and then assign last element to first and
//if we try to first assign the last element to first it wont work as in this logic we are trying to come reverse and assign right 
//that is first only save last element to some variable and then mess with elements and then that last element assign to first
public class Array_cyclicRotateByOne {

	private int[] cyclicRotateByOne(int arr[]){
		
		int n=arr.length;
		int x=arr[n-1];
		
		//we should 
		for(int i=n-1;i>0;i--){
			arr[i]=arr[i-1];
		}
		arr[0]=x;
		
		return arr;
		}
	public static void main(String args[]){
		Array_cyclicRotateByOne acr=new Array_cyclicRotateByOne();
		int b[]={1,2,3,4,5};
		int res[]=acr.cyclicRotateByOne(b);
		for(int e:res)
			System.out.print(e+" ");
	}
}
