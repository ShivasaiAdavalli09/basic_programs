package geekforGeeks;

public class Sort012 {

	//first count no of each number by switch
	//while count of each how many increase i size
	//for every while update i decrement count
	
	
	public static void main(String args[]){
		
		int arr1[]={0,1,2,0,0,2,2,1};//o/p: {0,0,0,1,1,2,2,2};
		int len=arr1.length;
		int count0=0,count1=0,count2=0;
		
		for(int i=0;i<len;i++)
		{
			switch(arr1[i]){
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			
			}
		}
		int i=0;
		while(count0>0){
			
			arr1[i++]=0;
			count0--; //we decrement for every increase in i value else it will go on increasimg infinite or use for loop
			}
		while(count1>0){
			arr1[i++]=1;
			count1--;
		}
		while(count2>0){
			arr1[i++]=2;
			count2--;
		}
		for(i=0;i<len;i++){
			System.out.println(arr1[i]);
		}
	}
	
}
