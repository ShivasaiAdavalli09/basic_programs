package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//https://beginnersbook.com/2017/11/java-8-stream-allmatch-example/
class StudentIns{
	int stuId;
	int stuAge;
	String stuName;
	StudentIns(int id, int age, String name){
	      this.stuId = id;   
	      this.stuAge = age;  
	      this.stuName = name;  
	   }  
	  
	public int getStuId() { 
	      return stuId;  
	   }  
	   public int getStuAge() {  
	      return stuAge;  
	   } 
	   public String getStuName() {  
	      return stuName;  
	   }  
	   public static List<StudentIns> getStudents(){ 
		      List<StudentIns> list = new ArrayList<>(); 
		      list.add(new StudentIns(11, 28, "Lucy")); 
		      list.add(new StudentIns(28, 27, "Tim")); 
		      list.add(new StudentIns(32, 34, "Aaniel")); 
		      list.add(new StudentIns(49, 27, "Steve")); 
		      return list; 
		   }
	}


public class Java8StreamAllMatch {

	public static void main(String[] args) {
		Predicate<StudentIns> p1=s->s.stuName.startsWith("A");
		Predicate<StudentIns> p2=s->s.stuAge<40;
		Predicate<StudentIns> p3=s->s.stuAge<40 && s.stuName.startsWith("P");
		
		List<StudentIns> Stulist = StudentIns.getStudents();
		boolean b1=Stulist.stream().allMatch(p1);
		System.out.println("list.stream().allMatch(p1):"+b1);
		
		boolean b2=Stulist.stream().allMatch(p2);
		System.out.println("list.stream().allMatch(p1):"+b2);
		
		
		boolean b3=Stulist.stream().allMatch(p3);
		System.out.println("list.stream().allMatch(p1):"+b3);
		
		boolean b4=Stulist.stream().noneMatch(p1);
		System.out.println("list.stream().noneMatch(p1):"+b4);
		
		
		boolean b5=Stulist.stream().noneMatch(p1);
		System.out.println("list.stream().noneMatch(p1):"+b5);
		
		boolean b6=Stulist.stream().anyMatch(p3);
		System.out.println("list.stream().allMatch(p1):"+b6);
		
		boolean b7=Stulist.stream().anyMatch(p1);
		System.out.println("list.stream().allMatch(p1):"+b7);
		
	}
}
