package Javatpoint_programs;

//next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc
public class Basic_fibonacci {

public static void main(String args[]){
	
int n1=0,n2=1,n3;

int count=10;

System.out.print(n1+" "+n2);
for(int i=2;i<count;i++){
	
	n3=n1+n2;
	System.out.print(" "+n3);
	n1=n2;//first should be this because if put after below n2=3 bcoz n2 modified to n3 its n3 would be copied to n1 instead of n2 value
	n2=n3;
	
}

}
}
