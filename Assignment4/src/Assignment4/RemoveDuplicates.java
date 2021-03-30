package Assignment4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class NonDuplicates{
	
	public LinkedList<Integer> removeDuplicates(LinkedList<Integer> list) {
		LinkedList<Integer> newlist = new LinkedList<Integer>();
		for(Integer i : list) {
			if(!newlist.contains(i)) 
				newlist.add(i);			
		}
		return newlist;
	}	
}

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(11);
		list.add(11);
		list.add(30);
		list.add(14);
		list.add(10);	
		list.add(25);
		list.add(14);
		System.out.println("The unsorted LinkedList: "+list);
		Collections.sort(list);
		System.out.println("The sorted LinkedList: " +list);
		NonDuplicates nd = new NonDuplicates();
		System.out.println("LinkedList after removing duplicates: ");
		System.out.println(nd.removeDuplicates(list));
		
	}

}
