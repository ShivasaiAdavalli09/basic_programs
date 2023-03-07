package babbar_practiceprogToJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupJava8 {

	
	public static void main(String args[]){
		
		List<Integer> input=Arrays.asList(2,2,3,4,5,6);
		
		List<Integer> output=input.stream().sorted().distinct().collect(Collectors.toList());
		
		for(Integer o:output){
			System.out.println(o+" ");
		}
	}
}
