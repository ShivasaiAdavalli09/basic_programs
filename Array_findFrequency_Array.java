package GeeksForGeeks_450_programs;

import java.util.HashMap;
import java.util.Map;

public class Array_findFrequency_Array {

	static void countFreq(int arr[]){
		
		int n=arr.length;
		Map<Integer,Integer> mappy=new HashMap<>();
		// Traverse through array elements and
        // count frequencies
		
		for(int i=0;i<n;i++){
			if(mappy.containsKey(arr[i])){
				mappy.put(arr[i], mappy.get(arr[i])+1);
			}
			else{
				mappy.put(arr[i], 1);
			}
				
		}
		
		for(Map.Entry<Integer, Integer> entry: mappy.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	public static void main(String args[]){
		int arr[]={10,20,20,10,10,20,5,20};
		countFreq(arr);
	}
	
}
