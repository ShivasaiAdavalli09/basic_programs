package java8;

import java.util.Optional;

//https://beginnersbook.com/2017/10/java-8-optional-class/
//we have Optional isPresent,ifPresent,orElse,orElseGet for Optionl.of...
public class Java8OptionalDemo {
	public static void main(String[] args) {    
	      String[] str = new String[10];   
	      //below actual optional can be this below line if suspecting whole string 
	      // Optional<String[]> isNull = Optional.ofNullable(str); 
	      //we can use Optional.of() or Optional.OfNullable
	      //String foobar = <value or null>;
	     // Optional.of(foobar);         // May throw NullPointerException
	     // Optional.ofNullable(foobar); // Safe from NullPointerException
	      Optional<String> isNull = Optional.ofNullable(str[9]);        
	      if(isNull.isPresent()){     
	         //Getting the substring           
	         String str2 = str[9].substring(2, 5);          
	         //Displaying substring           
	         System.out.print("Substring is: "+ str2);       
	      }     
	      else{      
	         System.out.println("Cannot get the substring from an empty string");     
	      }                
	      str[9] = "AgraIsCool";       
	      Optional<String> isNull2 = Optional.ofNullable(str[9]);       
	      if(isNull2.isPresent()){        
	         //Getting the substring            
	         String str2 = str[9].substring(2, 5);            
	         //Displaying substring           
	         System.out.print("Substring is: "+ str2);          
	      }         
	      else{         
	         System.out.println("Cannot get the substring from an empty string");         
	      }  
	      
	      Optional<String> GOT = Optional.of("Game of Thrones");        
	         //Optional.empty() creates an empty Optional object        
	         Optional<String> nothing = Optional.empty();
	         /* isPresent() method: Checks whether the given Optional         
	          * Object is empty or not.         
	          */        
	         if (GOT.isPresent()) {          
	            System.out.println("Watching Game of Thrones");       
	         } 
	         else {            
	            System.out.println("I am getting Bored");      
	         }
	         /* ifPresent() method: It executes only if the given Optional         
	          * object is non-empty.         
	          */        
	         //This will print as the GOT is non-empty        
	         GOT.ifPresent(s -> System.out.println("Watching GOT is fun!"));                
	         //This will not print as the nothing is empty        
	         nothing.ifPresent(s -> System.out.println("I prefer getting bored"));
	         Optional<String> GOT1 = Optional.of("Game of Thrones");        
	         //Optional.empty() creates an empty Optional object        
	         Optional<String> nothing1 = Optional.empty();

	         //orElse() method
	         System.out.println("line no 62");
	         System.out.println(GOT1.orElse("Default Value")); 
	         System.out.println(nothing1.orElse("Default Value")); 

	         //orElseGet() method
	         System.out.println(GOT1.orElseGet(() -> "Default Value")); 
	         System.out.println(nothing1.orElseGet(() -> "Default Value"));
	         //Optional with filter
	         /* Filter returns an empty Optional instance if the output doesn't         
	          * contain any value, else it returns the Optional object of the          
	          * given value.         
	          */    
	         System.out.println(GOT.filter(s -> s.equals("GAME OF THRONES")));         
	         System.out.println(GOT.filter(s -> s.equalsIgnoreCase("GAME OF THRONES")));
	   }  
}
