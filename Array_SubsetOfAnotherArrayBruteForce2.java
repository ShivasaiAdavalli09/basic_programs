package GeeksForGeeks_450_programs;

//brute force only is best approach we also have methods using sorting try sometime
public class Array_SubsetOfAnotherArrayBruteForce2 {

	static void isSubset(int arr1[],int arr2[]){
		
		int count=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					arr1[i]=-1;
					count++;
					break;
				}
			}
		}
		
		if(count==arr2.length)
			System.out.println("b is a subset of a");
		else
			System.out.println("b is not a subset of a");
		
	}
	public static void main(String args[]){
		int a[]={11,1,13,21,3,7};
		int b[]={11,3,7,1};
		isSubset(a,b);
		
	 }
	}
