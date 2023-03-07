package java8;

@FunctionalInterface
interface HelloWorld{
	
	String sayHello(String name);
}


public class LambdaExpForMulExp23Schools {
public static void main(String[] args) {
	HelloWorld helloWorld=(message)->{
		String str1="helllo";
		String str2=str1+message;
		return str2;
	};
	
	System.out.println(helloWorld.sayHello("llo"));
}
}
