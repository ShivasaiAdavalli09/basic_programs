package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8StreamsConcat {

	public static void main(String[] args) {
		
		List<String> alphabets=Arrays.asList("abc","def","ghi");
		List<String> alphabetsPartTwo=Arrays.asList("jkl","mno","pqr");
		
		//create two streams from two list and concatenate
		Stream<String> opstream=Stream.concat(alphabets.stream(),alphabetsPartTwo.stream());
		
		//displaying
		opstream.forEach(p->System.out.print(p+" "));
	}
}
