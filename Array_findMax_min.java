package FINAL450_Array;

public class Array_findMax_min {

	private int maximum(int arr[]){
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	private int minimum(int arr[]){
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i])
				min=arr[i];
		}
		
		return min;
		
	}
	
	public static void main(String args[]){
		Array_findMax_min afm=new Array_findMax_min();
		int b[]={9,1,2,3,7,0};
		int reqMax=afm.maximum(b);
		System.out.println(reqMax);
		int reqMin=afm.minimum(b);
		System.out.println(reqMin);
		
	}
}
