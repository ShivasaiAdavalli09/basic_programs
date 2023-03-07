package java8;

import java.util.ArrayList;
import java.util.Collections;

//geeksforgeeks

class Movie implements Comparable<Movie>{

	private double rating;
	private String name;
	private int year;
	@Override
	public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		return this.year-m.year;
	}
	public Movie(String nm,double rt,int yr){
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

public class Java7Comparable {
public static void main(String[] args) {
	ArrayList<Movie> list=new ArrayList<Movie>();
	list.add(new Movie("force there",8.2,2012));
	list.add(new Movie("force is",8.5,2016));
	list.add(new Movie("is there",7.2,2020));
	
	Collections.sort(list);
	System.out.println("movies after sorting");
	for(Movie mov:list)
		System.out.println(mov.getName()+" "+mov.getRating()+" "+mov.getYear());
}
}
