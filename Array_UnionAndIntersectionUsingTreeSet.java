package FINAL450_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Array_UnionAndIntersectionUsingTreeSet {

	private ArrayList<Integer> UnionOfArray(int arr1[],int arr2[]){
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		//remove duplicate in array1 by adding it to treeset
		for(int e:arr1)
			set.add(e);
		//remove dups from array2 by adding to same treeset,hence both arrays in same treeset now
		for(int e:arr2)
			set.add(e);
		//now adding these set elements to arraylist
		ArrayList<Integer> list=new ArrayList<Integer>();//we can directly print set as well not a issue
		for(int i:set)
			list.add(i);
		return list;
		}
	private void intersectOfArray(int arr1[],int arr2[]){
		
		int i=0,j=0,m=arr1.length,n=arr2.length;
		TreeSet<Integer> tee=new TreeSet<Integer>();
		while(i<m && j<n){
			if(arr1[i]<arr2[j])
				i++;
			if(arr2[j]<arr1[i])
				j++;
			else{
				tee.add(arr2[j++]);
				i++;
			}
		}
		for(int s: tee)
			System.out.print(s+" ");
	}
	public static void main(String args[]){
		Array_UnionAndIntersectionUsingTreeSet aut=new Array_UnionAndIntersectionUsingTreeSet();
		int a[]={18,3,1,2,6,7,7,10};
		int b[]={10,18,17,16,16,14};
		ArrayList<Integer> result=aut.UnionOfArray(a, b);
		
		ListIterator<Integer> itr=result.listIterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println();
		aut.intersectOfArray(a, b);
	}

}
