package FINAL450_Array;

//this will work all negative numbers one side but not on sorted way
public class Array_MoveAllNegNumOneSideWithoutSort {

	private int[] reArrangeNeg(int arr[]){
		
		int j=0,temp;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
			if(i!=j){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			j++;
		}
		}
		return arr;
		}
	public static void main(String args[]){
		Array_MoveAllNegNumOneSideWithoutSort all=new Array_MoveAllNegNumOneSideWithoutSort();
		int b[]={-1,-2,-3,4,5,6,-7,8,9};
		b=all.reArrangeNeg(b);
		for(int e:b)
			System.out.print(e+" ");
		}
}
