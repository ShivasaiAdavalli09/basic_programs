package FINAL450_Array;


//we just need to swap last and first element 
public class Array_cyclicRotateByOneBySwapBrut {

	private int[] rotate(int arr[]){
		int n=arr.length;
		int i=0,j=n-1,temp;
		if(i!=j){
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		}
		
		return arr;
		}
	public static void main(String args[]){
		Array_cyclicRotateByOneBySwapBrut ars=new Array_cyclicRotateByOneBySwapBrut();
		int a[]={1,2,3,4,5};
		int res[]=ars.rotate(a);
		for(int e:res)
			System.out.print(e+" ");
	}
}
