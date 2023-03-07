package geekforGeeks;

public class ArraySumEqIndices {

	//{5,3,2,1,9,10,11},sum=30 ,find the indices for the sum
	//we have to find sub array by suming all elements and compare so keep every element as sum and
	//add up to next element everytime and compare
	public static void main(String args[]){
	int arr1[]={11, 15, 6, 7, 9, 10},sum=16;
	int len=arr1.length;
	for(int i=0;i<len;i++){
		int comp=arr1[i];
		for(int j=i+1;j<len;j++){
			comp=comp+arr1[j];
			if(comp==sum){
				System.out.println("the given sum"+" "+sum+" "+"is found between"+i+" "+j);
			}
		}
	}
	
}
}
