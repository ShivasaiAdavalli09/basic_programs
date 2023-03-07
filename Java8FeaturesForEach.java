package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

//https://www.digitalocean.com/community/tutorials/java-8-features-with-examples#quick-overview-of-java-8-features

//forEach() method in iterable interface
public class Java8FeaturesForEach {

	public static void main(String args[]){
		
		//creating sample collection
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		//traversing using iterator
		System.out.println("traversing using iterator");
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		//traversing using java8 forEach()
		System.out.println();
		System.out.println("traversing using forEach");
		list.forEach(new Consumer<Integer>(){

			@Override
			public void accept(Integer t) {
				System.out.print(t+" ");
			}
			
		});
		//traversing with Consumer interface implementation
		MyConsumer action=new MyConsumer();
		System.out.println();
		System.out.println("using the reusable implements Consumer interface");
		list.forEach(action);//can use action or any name basically this MyConsumer class is implemented consumer below hence this is one way
		
	}
}


class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.print(t+" ");
		
	}
	
}
