package GeeksForGeeks_450_programs;

public class Array_Rotation {

	static void rotateArr(int arr[],int d){
		
		for(int i=0;i<d;i++){
			rotateArrByOne(arr);
		}
	}

	 static void rotateArrByOne(int[] arr) {
		
		 int n=arr.length;
		 int temp=arr[0];
		 for(int i=0;i<n-1;i++){
			 arr[i]=arr[i+1];
		 }
		 arr[n-1]=temp;
		
	}
	 public static void main(String args[]){
		 int arr[]={1,2,3,4,5,6};
		 int d=2;
		 System.out.println("roate array by 1");
		 rotateArr(arr,1);
		 for(int i=0;i<arr.length;i++)
			 System.out.print(arr[i]+" ");
		 System.out.println();
		 System.out.println("rotate array by 2");
		 rotateArr(arr,2);
		 
		 for(int i=0;i<arr.length;i++)
			 System.out.print(arr[i]+" ");
	 }
}

