package geekforGeeks;

//https://www.geeksforgeeks.org/reorder-a-array-according-to-given-indexes/
//Input:  arr[]   = [10, 11, 12];
//index[] = [1, 0, 2];
//Output: arr[]   = [11, 10, 12]
//index[] = [0,  1,  2] 
//logic is temp[index[i]]=arr[i];
//Input:  arr[]   = [50, 40, 70, 60, 90]
//index[] = [3,  0,  4,  1,  2]
//Output: arr[]   = [40, 60, 90, 50, 70]
//index[] = [0,  1,  2,  3,   4]
public class ArrRearrangeBasOnIndex {

	static void reOrder(int arr[],int index[]){
		
		int n=arr.length;
		int temp[]=new int[n];
		
		//arr[i] should be present at index[i] index
		for(int i=0;i<n;i++)
			temp[index[i]]=arr[i];
		
		System.out.print("modified array");
		for(int i=0;i<n;i++){
			System.out.println();
			System.out.print(temp[i]+" ");
		
		}
		//copy temp to array is not required as per link mentioned
		// Copy temp[] to arr[]
       /* for (int i=0; i<arr.length; i++)
        {
           arr[i]   = temp[i];
           index[i] = i;
        }*/
		System.out.println("modified index array");
		for(int i=0;i<n;i++){
			index[i]=i;
			System.out.print(index[i]+" ");
		}
		
	}
	public static void main(String args[]){
		
		int arr[] = new int[]{50, 40, 70, 60, 90};
	    int index[] = new int[]{3,  0,  4,  1,  2};
		
	    reOrder(arr,index);
	}
	
}
