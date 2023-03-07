package babbar_450_array;

public class Common_Elem_3_Sorted_Array {

	private static void commonElement(int arr1[],int arr2[],int arr3[]){
		
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length && k<arr3.length){
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){ //if x=y,y=z then x=z
				System.out.println(arr1[i]+" "); //display any array element
				i++;
				j++;
				k++;
			}
			//x<y
			else if(arr1[i]<arr2[j]){
				i++;
			}
			//y<z
			else if(arr2[j]<arr3[k]){
				j++;
			}
			else
				k++;
		}
	}
	public static void main(String args[]){
		int input[]={10,20,8,6,3,2,70};
		int input1[]={1,2,4,5,10,20,60};
		int input2[]={10,20,30,100,80};
		commonElement(input,input1,input2);
		
	}
}
