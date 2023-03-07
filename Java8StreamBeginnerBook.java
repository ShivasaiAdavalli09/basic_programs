package java8;

import java.util.ArrayList;
import java.util.List;

public class Java8StreamBeginnerBook {

	public static void main(String[] args) {
		int count=0;
		List<String> names=new ArrayList<String>();
		names.add("ajeet");
		names.add("nagan");
		names.add("Steve");
		names.add("ohnson");
		
		//using java 7
		/*for(String name:names)
			if(name.length()<6){
				count++;
			}
		System.out.println("the total count"+count);*/
		
		//using java 8
		long countStr=names.stream().filter(p->p.length()<6).count();
		System.out.println("the count is"+countStr);
	}
}
