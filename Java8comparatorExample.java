package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
	
	int rollno;
	String name;
	
	Student(int rollno,String name){
		//super();
		this.rollno=rollno;
		this.name=name;
	}
}


public class Java8comparatorExample {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"ashish"));
		list.add(new Student(3,"zareen"));
		list.add(new Student(2,"philip"));
		
		System.out.println("sorting on the basis of names");
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Student std:list)
			System.out.println(std.rollno+" "+std.name);
		
	}
	
}
