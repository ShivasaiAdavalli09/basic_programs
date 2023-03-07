package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//https://beginnersbook.com/2017/10/java-8-foreach/
public class Java8ReferenceMethod {
	 public static void main(String[] args) {
	      List<String> fruits = new ArrayList<String>();
	      fruits.add("Apple");
	      fruits.add("Orange");
	      fruits.add("Banana");
	      fruits.add("Pear"); 
	      fruits.add("Mango");
	      //lambda expression in forEach Method 
	      fruits.forEach(str->System.out.println(str));
	      
	      //lambda and filter and referesnce method to print,this reference is used inside forEach
	      fruits.stream().filter(f->f.startsWith("M")).forEach(System.out::println);
	      fruits.stream().filter(f->f.startsWith("M")).collect(Collectors.toList()).forEach(p->{
	    	  System.out.println("iterate"+" "+p);
	      });
	      //Java – Stream forEachOrdered() Method Example
	      //For sequential streams the order of elements is same as the order in the source, so the output would be same whether you use forEach or forEachOrdered. 
	      //However when working with parallel streams, you would always want to use the forEachOrdered() method when the order matters to you, as this method guarantees 
	      //that the order of elements would be same as the source.
	      //Lets take an example to understand the difference between forEach() and forEachOrdered().
	      fruits.stream().filter(f->f.startsWith("M")).parallel().forEach(System.out::println);
	      
	      fruits.stream().filter(f->f.startsWith("M")).parallel().forEachOrdered(System.out::println);
	      //also has below
	      fruits.parallelStream().filter(f->f.startsWith("M")).forEachOrdered(System.out::println);
	   }
}
