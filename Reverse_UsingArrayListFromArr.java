package babbar_450_array;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_UsingArrayListFromArr {
	 
    /*function reverses the elements of the array*/
    static void reverse(String myArray[])
    {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
    }
 
     public static void main(String[] args)
    {
        String [] myArray = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
        System.out.println("Original Array:" + Arrays.asList(myArray));
        reverse(myArray);
    }
}
