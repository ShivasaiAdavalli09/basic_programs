package java8;

//w3schools
//Functional Interface is an interface with only single abstract method. As a functional interface can have only one abstract method that’s why it is also known as 
//Single Abstract Method Interfaces or SAM Interfaces. We can either create our own functional interface or can use predefined functional interfaces provided by java.
//When we creating our own functional interface we should use @FunctionalInterface annotation to mark it as functional interface. Although it is not mandatory to use it, but it’s good to use it with functional interfaces to avoid addition of extra methods accidentally.
//It will throw compile time error if we try to add more than one abstract method in a functional interface.
//A functional interface can have only one abstract method. Along with the one abstract method, it can have any number of default and static methods. It can also have methods of object class.
//A functional interface can extends another interface only when it does not have any abstract method.

@FunctionalInterface //optional to add
interface AddInterface{
	
	void add(int a,int b);
	
	//it can contain any number of object class methods
	int hashCode();
	String toString();
	boolean equals(Object obj);
}



public class Java8FunctionalIntefracew3schools implements AddInterface {

	/*public void add(int a,int b){
		System.out.println(a+b);
	}*/
	
	public static void main(String[] args) {
		Java8FunctionalIntefracew3schools addIn=new Java8FunctionalIntefracew3schools();
		addIn.add(4,5);
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
}
