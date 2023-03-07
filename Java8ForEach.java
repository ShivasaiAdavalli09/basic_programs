package java8;

import java.util.HashMap;
import java.util.Map;

//https://beginnersbook.com/2017/10/java-8-foreach/

public class Java8ForEach {
	public static void main(String[] args) {
	      Map<Integer, String> hmap = new HashMap<Integer, String>();
	      hmap.put(1, "Monkey");
	      hmap.put(2, "Dog"); 
	      hmap.put(3, "Cat");  
	      hmap.put(4, "Lion");   
	      hmap.put(5, "Tiger");   
	      hmap.put(6, "Bear");
	      
	      hmap.forEach((key,value)->{
	    	  System.out.println(key+" "+value);
	      });
	      //using method reference
	     //fruits.forEach(System.out::println); //when all strings
	      
	      hmap.forEach((key,value)->{
	    	  if(key==4)
	    		  System.out.println("value associated with it"+" "+value);
	      });
	      
	      hmap.forEach((key,value)->{
	    	  if("Cat".equals(value)){
	    		  System.out.println("key associated with value"+" "+key);
	    	  }
	      });
}
}
