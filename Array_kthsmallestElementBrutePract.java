package FINAL450_Array;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Array_kthsmallestElementBrutePract {

	private int kthsmallelem(int arr[],int k){
		
		Set<Integer> ts=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++){
			ts.add(arr[i]);
		}
		Iterator<Integer> itr=ts.iterator();
		while(k>0){
			itr.next();
			k--;
			
		}
			return itr.next();
		}
	public static void main(String args[]){
		Array_kthsmallestElementBrutePract aki=new Array_kthsmallestElementBrutePract();
		int b[]={6,3,2,9,1};
		int k=3;
		int req=aki.kthsmallelem(b, k);
		System.out.println(req);
		
	}
}
