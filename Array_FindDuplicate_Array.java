package GeeksForGeeks_450_programs;


//demerit of this program is Math.abs(int) cannot take integer of more than one digit i.e 10,11 et

public class Array_FindDuplicate_Array {

	public static void printRepeatNum(int arr[]){

		
		int size=arr.length;
		System.out.print("the repeating elements are:");
		
		for(int i=0;i<size;i++){
			int j=Math.abs(arr[i]);
			
			if(arr[j]>=0)
				arr[j]=-arr[j];
			else
				System.out.print(j+" ");
		}
	
		
	}
	public static void main(String args[]){
		
		int a[]={1,2,3,1,2,6,6};
		printRepeatNum(a);
	}
}
