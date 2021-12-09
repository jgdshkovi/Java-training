package com.collections1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//duplicates are not allowed
//insertion order is not preserved 
public class ComparableCompraratorEx {
	public static void main(String[] args) {
		TreeSet<String> al = new TreeSet<String>(new MyOrder());// add 10 NSO ,CSO
		al.add("vadiraj");
		al.add("anitha");
		al.add("neha");
		al.add("suresh");
		al.add("neha");
		System.out.println(al);// FI-->SAM->Comprable-->compareTo,Comparator--compare

	}
}
class MyOrder implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
	
		//return -o1.compareTo(o2) ;
		return o2.compareTo(o1);
	}
	
}
