package GeeksForGeeks_450_programs;

import java.util.Arrays;
import java.util.Comparator;

//this is gfg code https://www.geeksforgeeks.org/merging-intervals/
//practice stack approach also from gfg

class Interval{
	int start,end;
	
	Interval(int start,int end){
		this.start=start;
		this.end=end;
	}
}


public class Array_merge_overlapIntervals {

	public static void mergeIntervals(Interval arr[]){
		// Sort Intervals in increasing order of
        // start time(if start time same then end one will be considered)
		Arrays.sort(arr,new Comparator<Interval>(){

			@Override
			public int compare(Interval i1, Interval i2) {
				return i1.start - i2.start;
			}	
		});
		
		int index=0;// Stores index of last element
        // in output array (modified arr[])
		// Traverse all input Intervals
		for(int i=1;i<arr.length;i++){
			// If this is not first Interval and overlaps
            // with the previous one
			if(arr[index].end>=arr[i].start){
				arr[index].end=Math.max(arr[index].end, arr[i].end);
				arr[index].start=Math.min(arr[index].start,arr[i].start);
			}else {
				index++;
				arr[index]=arr[i];
			}
			}	
		
		// Now arr[0..index-1] stores the merged Intervals
		System.out.print("The merged intervals are:");
		for(int i=0;i<=index;i++){
		 System.out.print("["+arr[i].start+","+arr[i].end+"]");	
		}
		
		}
	public static void main(String args[]){
		Interval arr[]=new Interval[4];
		arr[0]=new Interval(6,8);
		arr[1]=new Interval(1,9);
		arr[2]=new Interval(2,4);
		arr[3]=new Interval(4,7);
		mergeIntervals(arr);
	}
}
