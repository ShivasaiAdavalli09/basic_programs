package GeeksForGeeks_450_programs;

import java.math.BigInteger;

public class Array_FactOfLargeNumber {

	static BigInteger factorial(int N){
		//Big Integer class extends Number and implements Comparable interface. 
		//It provides analogues to all of Java's primitive integer operators and all methods from java.lang.Math package. it has multiply,max,min,abs and so many others
		//Initialize result
		
		BigInteger f=new BigInteger("1"); //or BigInteger.ONE
		
		//Multiply f with 2,3,....N
		for(int i=2;i<=N;i++){
			f=f.multiply(BigInteger.valueOf(i));
		}
		
		return f;
		}
	
	public static void main(String args[]){
		
		int n=20;
		System.out.print(factorial(n));
	}
}
