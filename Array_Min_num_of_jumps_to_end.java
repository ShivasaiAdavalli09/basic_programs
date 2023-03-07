package GeeksForGeeks_450_programs;


//https://stackoverflow.com/questions/27858356/how-to-find-minimum-number-of-jumps-to-reach-the-end-of-the-array-in-on-time
public class Array_Min_num_of_jumps_to_end {

	public static int jump(int A[]){
		int n=A.length;
		if(n<=1)
			return 0;
		int maxReach=A[0];
		int step=A[0];
		int jump=1;
		
		for(int i=1;i<n;i++){
			if(i==n-1)
				return jump;
			if(i+A[i]>maxReach)
				maxReach=i+A[i];
			step--;
			if(step==0){
				jump++;
				step=maxReach-i;
			}
		}
		
		return jump;
		}
	public static void main(String args[]){
		int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int p=jump(arr);
		System.out.print("the min jumps is"+" "+p);
		
		
	}
}
