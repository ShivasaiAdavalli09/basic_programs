package GeeksForGeeks_450_programs;


//source is gfg https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/

//Array_SubsetOfAnotherArrayBruteForce2 program is easy than this so follow that
public class Array_SubsetOfAnotherArrayBruteForce {

	static boolean isSubset(int arr1[],int arr2[]){
		
		int i=0,j=0; //we are delaring here instead of loop because this will be use after loop logic 
		int m=arr1.length,n=arr2.length;
		
		for(i=0;i<n;i++){//arr2 elements i.e which is smaller in size 
			for(j=0;j<m;j++)//arr1 elements
				if(arr2[i]==arr1[j])
					break;
		/* If the above inner loop
        was not broken at all then
        arr2[i] is not present in
        arr1[] */
		if(j==m)
			return false;
		}
		 /* If we reach here then all
        elements of arr2[] are present
        in arr1[] */
		return true;
	}	
	public static void main(String args[]){
		int a[]={11,1,13,21,3,7};
		int b[]={11,3,7,1};
		
		if(isSubset(a,b))
			System.out.println("b is subset of a");
		
		else
			System.out.println("b is not subset of a");
		
	}
	
	
}
