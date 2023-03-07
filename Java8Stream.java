package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//difference is sequential stream guarantees sequence parallelStream wont guarntee sequence
public class Java8Stream {

	public static void main(String args[]){
	
		List<Integer> myList=new ArrayList<Integer>();
		
		for(int i=0;i<100;i++)
			myList.add(i);
		
		//sequential stream
		Stream<Integer> sequentialStream=myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream=myList.parallelStream();
		
		//using lambda with stream api,filter
		System.out.println("high nums sequence");
		Stream<Integer> highNums=sequentialStream.filter(p-> p >90);
		//using lambda for each
		highNums.forEach(p -> System.out.print(p+" "));
		
		System.out.println("high nums parallel");
		//using lambda with parallel stream api,filter
		Stream<Integer> highParallelNums=parallelStream.filter(p-> p >90);
		//using lambda forEach to print
		highParallelNums.forEach(p -> System.out.print(p+" "));
		
	}
}
