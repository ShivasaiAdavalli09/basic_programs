package babbar_450_array;

public class ArrayDuplicateElement {

	private static void duplicateElements(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	public static void main(String args[]){
		int input[]={2,1,3,4,2,1,6,7,8,9,3};
		System.out.println("the duplicate elements are\n");
		duplicateElements(input);
	}
}
