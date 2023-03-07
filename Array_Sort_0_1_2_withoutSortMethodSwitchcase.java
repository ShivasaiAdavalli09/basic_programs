package FINAL450_Array;

public class Array_Sort_0_1_2_withoutSortMethodSwitchcase {

	private int[] Sort012(int arr[]){
	int i,count0=0,count1=0,count2=0;
	for(i=0;i<arr.length;i++){
		switch(arr[i]){
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
	//now we got to know no of 0,1,2 now update the array
	i=0;//or we can use other vaiable
	//arrange all 0s now in array
	while(count0>0){
		arr[i++]=0;
		count0--;
	}
	//arrange all 1s now in array
	while(count1>0){
		arr[i++]=1;
		count1--;
	}
	
	//arrange all 2s and update array
	while(count2>0){
		arr[i++]=2;
		count2--;
	}
	return arr;
	}
	public static void main(String args[]){
		Array_Sort_0_1_2_withoutSortMethodSwitchcase art=new Array_Sort_0_1_2_withoutSortMethodSwitchcase();
		int b[]={1,2,0,0,1,1,2,2};
		b=art.Sort012(b);
		System.out.println("printing array first time");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		System.out.println("printing array again");
		for(int c:b)
			System.out.print(" "+c);
	}
}
