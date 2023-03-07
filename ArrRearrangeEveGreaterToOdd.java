package geekforGeeks;

//https://www.geeksforgeeks.org/rearrange-array-such-that-even-positioned-are-greater-than-odd/
//dont follow this follow ArrRearrangeEveGreaterToOdd1 for easy and efficient approach
import java.util.Arrays;

//follow the next one
//Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i
//https://www.geeksforgeeks.org/rearrange-array-arri-arrj-even-arri/
//Input : arr[] = {1, 2, 1, 4, 5, 6, 8, 8} 
//Output : 4 5 2 6 1 8 1 8

public class ArrRearrangeEveGreaterToOdd {

	static void rearrange(int arr[]){
		
		int n=arr.length;
		int evenPos=n/2;
		int oddPos=n-evenPos;
		
		int tempArr[]=new int[n];
		
		//copying arr to tempArr
		for(int i=0;i<n;i++){
			tempArr[i]=arr[i];
		}
		
		//sorting the temp array
		Arrays.sort(tempArr);
		
		int j=oddPos-1;
		
		//fill up in odd positions in original array
		
		for(int i=0;i<n;i+=2){
			arr[i]=tempArr[j];
			j--;
			}
		j=oddPos;
		//fill up the even positions
		for(int i=1;i<n;i+=2){
			arr[i]=tempArr[j];
			j++;
		}
		
		//display array
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String args[]){
		
		int arr[]={1,2,3,4,5,6,7};
		//int arr[]={1, 2, 1, 4, 5, 6, 8, 8};
		
		rearrange(arr);
		
	}
}
