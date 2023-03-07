package GeeksForGeeks_450_programs;

import java.util.HashMap;
import java.util.Map;

//this is easiest and to be followed approach
public class Array_FindDuplicate_Array_Frequency_method {

static void findDup(int arr[]){
	
	int n=arr.length;
	Map<Integer,Integer> mappy=new HashMap<>();
	
	for(int i=0;i<n;i++){
		if(mappy.containsKey(arr[i])){
			mappy.put(arr[i], mappy.get(arr[i])+1);
		}
		else{
			mappy.put(arr[i], 1);
		}
	}
	System.out.println("the duplicate elements are:");
	for(Map.Entry<Integer, Integer> entry: mappy.entrySet()){
		if(entry.getValue()==2){
			System.out.println(entry.getKey());
		}
	}
 }

public static void main(String args[]){
	
	int a[]={10,20,10,30,20,40};
	findDup(a);
}
}
