package java8;


@FunctionalInterface
interface AddInterfaceDemo{
	void add(int a,int b);
}


public class LambdaFunctionw3schools {

	public static void main(String[] args) {
		//without lamba,implemeting with anonymous class
		/*AddInterfaceDemo addInter=new AddInterfaceDemo() {
			
			@Override
			public void add(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println(a+b);
				}
		};
		addInter.add(2,3);
	}*/
	// by using lambda function
		AddInterfaceDemo addInter=(a,b)->{
			System.out.println(a+b);
		};
		addInter.add(2,4);
		
	}
	
}
