package GeeksForGeeksPractice;


// for input 3 
//333222111
//332211
//321
public class Pattern {
	

	 // Function to demonstrate printing pattern
	 public static void printStars(int n)
	 {
	     int i, j;

	     // outer loop to handle number of rows
	     //  n in this case
	     for(i=0; i<n; i++)
	     {

	         //  inner loop to handle number of columns
	         //  values changing acc. to outer loop   
	         for(j=0; j<=i; j++)
	         {
	             // printing stars
	             System.out.print(i);
	         }

	         // ending line after each row
	         System.out.println();
	     }
	}

	 // Driver Function
	 public static void main(String args[])
	 {
	     int n = 5;
	     printStars(n);
	 }

}
