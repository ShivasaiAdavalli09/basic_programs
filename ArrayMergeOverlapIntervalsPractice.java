package babbar_450_array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

class IntervalDemo{
	int start,end;
	IntervalDemo(int start,int end){
		this.start=start;
		this.end=end;
	}
}

public class ArrayMergeOverlapIntervalsPractice {
   
	private static Stack<IntervalDemo> mergeOverlapArray(IntervalDemo arr[]){
		
		Stack<IntervalDemo> stack=new Stack<IntervalDemo>();
		
		Arrays.sort(arr,new Comparator<IntervalDemo>(){

			@Override
			public int compare(IntervalDemo o1, IntervalDemo o2) {
				
				return o1.start-o2.start;
			}
			});
		
		stack.push(arr[0]);
		for(int i=0;i<arr.length;i++){
	    IntervalDemo top=stack.peek();
	    if(top.end<arr[i].start)
	    	stack.push(arr[i]);
	    if(top.end<arr[i].end){
	    	top.end=arr[i].end;
	    	stack.pop();
	    	stack.push(top);
	    	
	    }
	    
		}
		return stack;
	}
	
	public static void main(String args[]){
		IntervalDemo input[]=new IntervalDemo[4];
		input[0]=new IntervalDemo(6,8);
        input[1]=new IntervalDemo(1,9);
        input[2]=new IntervalDemo(2,4);
        input[3]=new IntervalDemo(4,7);
        Stack<IntervalDemo> stackOut=mergeOverlapArray(input);
        System.out.println("the merged Intervals");
        if(!stackOut.isEmpty()){
        	IntervalDemo t=stackOut.pop();
        	System.out.print("["+t.start+","+t.end+"]");
        }
		
	}
}
