package GeeksForGeeks_450_programs;

//this brute force is O(n^3)
public class Array_TripletEqualToSumBruteForce {

	static void find3numbers(int arr[],int sum){
		
		for(int i=0;i<arr.length-2;i++){//because we can go till n-2 only as the next last two elements would be j,k
			for(int j=i+1;j<arr.length-1;j++){
				for(int k=j+1;k<arr.length;k++){
					if(arr[i]+arr[j]+arr[k]==sum){
					System.out.print("Triplet is"+"  "+arr[i]+"  "+arr[j]+"  "+arr[k]);	
					}
				}
			}
		}
			
}
	
	public static void main(String args[]){
		
		int a[]={1,4,45,6,10,8};
		int sum=22;
		find3numbers(a,sum);
	}
	
}
