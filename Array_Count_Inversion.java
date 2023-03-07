package babbar_450_array;

//if input[]={20,5,17,8} then inversions are {20,5},{20,17},{20,8},{17,8} i.e first element should be > second
//if array is sorted then inversions are zero
public class Array_Count_Inversion {

	private static int countInversions(int arr[]){
		
		int count_inv=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					count_inv++;
				}
			}
		}
		return count_inv;
		}
	public static void main(String args[]){
		int input[]={20,5,17,8};
		int output=countInversions(input);
		System.out.print("the count of inversions"+" "+output);
	}
}
