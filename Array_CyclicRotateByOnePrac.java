package FINAL450_Array;

//even brute approach is more easier as we are supposed to swap just last and first element,hence prefer brute force
//actually this is the brute approach but remember the best logic
public class Array_CyclicRotateByOnePrac {

	private int[] rotate(int arr[])
    {
       int x = arr[arr.length-1];
       
       for (int i = arr.length-1; i > 0; i--)
          arr[i] = arr[i-1];
       arr[0] = x;
       
	return arr;
    }
	public static void main(String args[]){
		Array_CyclicRotateByOnePrac ars=new Array_CyclicRotateByOnePrac();
		int a[]={1,2,3,4,5};
		int res[]=ars.rotate(a);
		for(int e:res)
			System.out.print(e+" ");
	}
}
