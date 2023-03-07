package babbar_450_array;

//also can simply use sort
//refer Array_Rearrange_NegPos_Alternate_Position first half
public class NegaElemToOneSide {

	private static int[] negEleToArray(int arr[]){
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
		
		int input[]={9,-1,-2,-10,4,5,-3,-7,11,6,4};
		System.out.println("Sorted negative elements at one side array");
		int out[]=negEleToArray(input);
		for(Integer i:out)
			System.out.print(i+" ");
	}
}
