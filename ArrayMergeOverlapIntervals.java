package babbar_450_array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

//https://www.geeksforgeeks.org/merging-intervals/
//Define Interval, Sort Intervals based on start time
//push the first interval into stack
//for each interval do as 2 steps
//1. if the current interval doesnt overlap with top of stack the push the current interval.
//2. if the current interval overlaps with top of stack then update the end of top and pop the old and push this updated one
//the end of stakc is merged interval
class Interval{
	int start,end;
	Interval(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
}
public class ArrayMergeOverlapIntervals {
	
	private static void mergeIntervals(Interval arr[]){
		
		/*// Test if the given set has at least one interval
        if (arr.length <= 0)
            return;*/
        
        Stack<Interval> stack=new Stack<Interval>();
        
        Arrays.sort(arr,new Comparator<Interval>(){

			@Override
			public int compare(Interval i1, Interval i2) {
				return i1.start-i2.start;
			}
        	
        });
        
        stack.push(arr[0]);
        for(int i=1;i<arr.length;i++){
        	Interval top=stack.peek();
            
        	if(top.end<arr[i].start)
        		stack.push(arr[i]);
        	else if(top.end<arr[i].end){
        		top.end=arr[i].end;
        		stack.pop();
        		stack.push(top);
        	}
         }
        System.out.println("the merged intervals are");
        while(!stack.isEmpty()){
        	Interval t=stack.pop();
        	System.out.print("["+t.start+","+t.end+"]");
        }
	}
	public static void main(String args[]){
		Interval arr[]=new Interval[4];
		/*arr[0]=new Interval(6,8);
        arr[1]=new Interval(1,9);
        arr[2]=new Interval(2,4);
        arr[3]=new Interval(4,7);*/
		arr[0]=new Interval(6,8);
        arr[1]=new Interval(1,3);
        arr[2]=new Interval(2,4);
        arr[3]=new Interval(4,7);
        mergeIntervals(arr);
	}
}
