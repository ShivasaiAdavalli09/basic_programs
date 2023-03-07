package geekforGeeks;

//https://www.geeksforgeeks.org/rearrange-array-arri/

public class RearrangeArrPosEqEle {

static void rearrArray(int arr[]){
	
	int temp;
	
	for(int i=0;i<arr.length;i++){
		
		for(int j=0;j<arr.length;j++){
			
			if(arr[j]==i){
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				break;
			}
		}
	}
	
	//we use this for lopp if we want to keep all other elements as -1
	/*for(int i=0;i<arr.length;i++){
		
		if(arr[i]!=i){
			arr[i]=-1;
		}
	}*/
	
	print(arr);
	}

static void print(int arr[]){
	
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
}

public static void main(String args[]){
	
	int a1[]={3,4,1,2,10,9};
	
	rearrArray(a1);
	
}


}
