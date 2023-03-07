package GeeksForGeeks_450_programs;


// I/P arr[]={1,2,1,0,0,2,1,1,2}
// O/P arr[]={0,0,1,1,1,1,2,2}
public class Array_Sort_0_1_2 {

	static int[] Segregate012(int arr[]){
		
		int count0=0,count1=0,count2=0;
		
		int n=arr.length;
		for(int i=0;i<n;i++){
			if(arr[i]==0)
				count0++;
			if(arr[i]==1)
				count1++;
		}
		count2=n-count1-count0;
		
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
		return arr;
	}
	public static void main(String args[]){
		
		int arr[]={1,2,1,0,0,1,2,1,2,0,0,0};
		
		int res[]=Segregate012(arr);
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
}
