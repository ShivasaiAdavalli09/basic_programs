package Javatpoint_programs;

//next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc
public class Basic_fibonacci1 {

	public static void main(String args[]){
		
		int n1=0,n2=1,n3;
		int count=10;
		int i=2;
		System.out.print(n1+" "+n2);
		while(i<=count){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			i++;
			}
	}
}
