package GeeksForGeeks_450_programs;

public class Array_RearrNegToFirst {

	static void rearrange(int arr[]){
		int n=arr.length;
		
		int j=0,temp;
		for(int i=0;i<n;i++){
			if(arr[i]<0){
				if(i!=j){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
	
	
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
}
	public static void main(String args[]){
		int arr[]={-1,-2,-3,4,5,6,-7,8,9};
		rearrange(arr);
		
	}
}