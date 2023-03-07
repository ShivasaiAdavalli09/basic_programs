package FINAL450_Array;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Array_kthsmallestElementBrute {

	public static void main(String args[]){
		int arr[]={6,3,2,9,1};
		int k=3;
		
		Set<Integer> s=new TreeSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
			s.add(arr[i]);
		
		Iterator<Integer> itr=s.iterator();
		while(k>0){
			itr.next(); //here iterator points at first element i.e 1
			k--; //here iterator points at k element i.e 3
		}
		System.out.println(itr.next()+" "+"is the req kth element");
	}
}
