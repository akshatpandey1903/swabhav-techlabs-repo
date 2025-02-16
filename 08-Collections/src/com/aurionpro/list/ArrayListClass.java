package com.aurionpro.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListClass {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<3; ++i){
			al.add(i+1);
		}
		
//		al.add(1, 3);
		
		Iterator<Integer> numIt = al.iterator();
		
		while(numIt.hasNext()){
			System.out.println(numIt.next());
		}
		
		ListIterator<Integer> listIt = al.listIterator();
		
		while(listIt.hasNext()){
			System.out.println(listIt.next());
		}
		
		while(listIt.hasPrevious()){
			System.out.println(listIt.previous());
		}
		
		for(Integer number : al){
			System.out.println(number);
		}
	}
}
