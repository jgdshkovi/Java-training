package com.collections1;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> emps = new TreeMap<Integer, String>();
		emps.put(123, "suresh");// Entry
		emps.put(924, "mahesh");
		emps.put(26, "ramya");
		emps.put(256, "sandeep");
		emps.put(123, "naresh");

		System.out.println(emps);

//		Set<Integer> keys = emps.keySet();
//
//		Iterator<Integer> itr = keys.iterator();
//		while (itr.hasNext()) {
//			int key = itr.next();
//			System.out.println(key + " " + emps.get(key));
//		}

		Set<Entry<Integer, String>> keys = emps.entrySet();

		Iterator<Entry<Integer, String>> itr = keys.iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
