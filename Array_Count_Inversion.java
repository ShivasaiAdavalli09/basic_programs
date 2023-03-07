package GeeksForGeeks_450_programs;

//if array is sorted then zero inversions and if array is in decreasing order then maximum count
public class Array_Count_Inversion {

	static void countInversion(int arr[]){
		
		int countInv=0;
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]>arr[j]){
					countInv++;
				}
			}
		}
		System.out.println("the number of inversion is"+" "+countInv);
	}
	
	public static void main(String args[]){
		
		int a1[]={8,4,2,1};
		countInversion(a1);
	}
}
