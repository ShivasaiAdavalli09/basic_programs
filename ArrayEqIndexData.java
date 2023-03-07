package geekforGeeks;

public class ArrayEqIndexData {

	//to rearrange array such that arr[i]=i
	//{0,5,6,1,2,3}  
	public static void main(String args[]){
	int arr[]={0,5,6,1,2,3};
	int len=arr.length;
	int temp;
	for(int i=0;i<len;i++){
		for(int j=0;j<len;j++){
			if(arr[j]==i){
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		if(arr[i]!=i)
			arr[i]=-1;
	}
	for(int i=0;i<len;i++)
		System.out.println(arr[i]);
	
	}
}
