package geekforGeeks;


//I/P is arr[]={1,1,2,1,0,0,2,1,2,0} O/P is arr[]={0,0,0,1,1,1,1,2,2,2}
//https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/

public class Segregate0s1s2s {

	static void SegArr(int arr[]){
		
		int n=arr.length;
		int count0=0,count1=0,count2=0;
		
		for(int i=0;i<n;i++){
			if(arr[i]==0)
				count0++;
		
		    if(arr[i]==1)
		    	count1++;
		}
		count2=n-count0-count1;
		
		/*//filling zeroes in array first
		for(int i=0;i<count0;i++)
			arr[i]=0;
		for(int i=count1;i<n;i++)
			arr[i]=2;
		for(int i=count0;i<count1;i++)
			arr[i]=1;*///this method not working hence go for while
		int i=0;
		while(count0>0){
			arr[i++]=0;
			count0--;
		}
		while(count1>0){
			arr[i++]=1;
			count1--;
		}
		
		while(count2>0){
			arr[i++]=2;
			count2--;
		}
		
		
		
		print(arr);
		}
	//print array
	static void print(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String args[]){
		
		int arr[]={1,1,2,2,2,2,2,0,0,0,0};
		SegArr(arr);
	}
	
	}
