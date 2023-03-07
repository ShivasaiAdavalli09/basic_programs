package babbar_450_array;

public class ArraySort012 {

	private static int[] Sort012(int arr[]){
	//int input[]={1,0,2,2,1,2,0,1,1,0,2,0,2,2};
	int p=0,q=0,r=0;
	int out[];
	
	//never forget to use break in switch 
	for(int i=0;i<arr.length;i++){
		switch(arr[i]){
		
		case 0:p++;	
		break;
		case 1:q++;
		break;
		case 2:r++;
		break;
		}
		
	}
	int i=0;
	while(p>0){
		arr[i++]=0;
		p--;
	}
	while(q>0){
		arr[i++]=1;
		q--;
	}
	while(r>0){
		arr[i++]=2;
		r--;
	}
	
	return arr;
			}
	public static void main(String args[]){
		int input[]={1,0,2,2,1,2,0,1,1,0,2,0,2,2};
		int out[]=Sort012(input);
		System.out.println("the array with sorted 0,1,2");
		for(Integer i:out)
			System.out.print(i+" ");
	}
}
