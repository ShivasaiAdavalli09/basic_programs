package GeeksForGeeks_450_programs;

//do not folow this approach follow union method approach

//if odd then median is (n+1)/2,if even then ((n/2)+(n/2 +1))/2
//https://www.geeksforgeeks.org/median-of-two-sorted-arrays/

public class Array_MedianOf2SortSameSizeArrays {

	static void getMedian(int arr1[],int arr2[],int n){
		
		int i=0,j=0,count,m1=-1,m2=-1;
		
		/* Since there are 2n elements, median will
        be average of elements at index n-1 and
        n in the array obtained after merging ar1
        and ar2 */
		
		for(count=0;count<=n;count++){
			/* Below is to handle case where all
            elements of ar1[] are smaller than
            smallest(or first) element of ar2[] */
			
			if(i==n){
				m1=m2;
				m2=arr2[0];
				break;
			}
			/* Below is to handle case where all
            elements of ar2[] are smaller than
            smallest(or first) element of ar1[] */
			else if(j==n){
				m1=m2;
				m2=arr1[0];
				break;
			}
			/* equals sign because if two
            arrays have some common elements */
		if(arr1[i]<=arr2[j]){
			/* Store the prev median */
			m1=m2;
			m2=arr1[i];
			i++;
		}
		else{
			/* Store the prev median */
			m1=m2;
			m2=arr2[j];
			j++;
			
		}
		}
	System.out.print("median is"+"  "+(m1 + m2)/2);
	}
	
	public static void main(String args[]){
			int a1[]={1, 12, 15, 26, 38};
			int a2[]={2, 13, 17, 30, 45};
			
	   		int n1=a1.length;
	   		int n2=a2.length;
		
	   		if(n1==n2)
	   			getMedian(a1,a2,n1);
	   			
	}
}
