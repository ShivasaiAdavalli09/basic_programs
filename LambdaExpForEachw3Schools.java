package java8;

import java.util.ArrayList;
import java.util.List;

//https://www.w3schools.blog/java-8-features-with-examples
public class LambdaExpForEachw3Schools {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("arun");
		list.add("varun");
		list.add("mahesh");
		list.forEach(
				(name)->System.out.println(name)
				);
		

	}
}
