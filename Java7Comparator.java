package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MovieMela {

	private double rating;
    private String name;
    private int year;
    
    public MovieMela(String nm,double rt,int yr){
    	this.name=nm;
    	this.rating=rt;
    	this.year=yr;
    }
    public double getRating(){
    	return rating;
    }
    public String getName(){
    	return name;
    }
    public int getYear(){
    	return year;
    }
	}

class NameCompare implements Comparator<MovieMela>{

	@Override
	public int compare(MovieMela m1, MovieMela m2) {
		// TODO Auto-generated method stub
		return m1.getName().compareTo(m2.getName());
	}
	}

public class Java7Comparator {
public static void main(String[] args) {
	
	ArrayList<MovieMela> list=new ArrayList<MovieMela>();
	list.add(new MovieMela("force",7.8,1995));
	list.add(new MovieMela("pathaan",7.4,1980));
	list.add(new MovieMela("don",9.0,1998));
	System.out.println("list after sorting by name");
	NameCompare nameCompare=new NameCompare();
	Collections.sort(list,nameCompare);
	for(MovieMela movie:list)
		System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
}
}
