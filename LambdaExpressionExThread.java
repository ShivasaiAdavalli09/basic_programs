package java8;

public class LambdaExpressionExThread {

	public static void main(String[] args) {
		//thread creation without lambda
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 1 is running");
				}
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		//thread creation with lambda
		Runnable r2=()->{
			System.out.println("Thread 2 is running...");
			System.out.println("thread 2 is by using lambda");
		};
		Thread t2=new Thread(r2);
		t2.start();
		}
}
