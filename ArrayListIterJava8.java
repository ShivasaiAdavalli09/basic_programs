package babbar_practiceprogToJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIterJava8 {

	public static void main(String args[]){
//		ArrayListIterJava8 ArrayListIterJava8=new ArrayListIterJava8();
//		ArrayListIterJava8.getClass();
		List<Integer> listNum=Arrays.asList(199,122,223,133,222,199);
		
		int input[]={1,2,3,4,5};
		//List<Integer> listNum1=Arrays.asList(input);
		Arrays.stream(input).filter(p->!(p%2==0)).forEach(e->{
			System.out.println("odd"+e);
		});
		
		listNum.stream().distinct().forEach(p->{
			System.out.print(p+" ");
		});
		listNum.stream().forEach(p->{
			if(p>200){
				System.out.print(p+" ");
			}
		});
		listNum.stream().filter(p->p>200).forEach(e->{
			System.out.print(e+" ");
		});
	}
}
