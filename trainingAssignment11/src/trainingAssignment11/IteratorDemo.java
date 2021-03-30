package trainingAssignment11;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


class LinkedhashMap{
	LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
	Scanner sc= new Scanner(System.in);
	void addItems() {
		System.out.println("Enter the elements in the LinkedHashMap");
		lhmap.put(sc.nextInt(), sc.next());
		lhmap.put(sc.nextInt(), sc.next());
		lhmap.put(sc.nextInt(), sc.next());
		
	}
	
	void displayMap() {
		System.out.println(lhmap);
	}
	
	void iterate() {
		Set <Entry<Integer, String>> s = lhmap.entrySet();
		Iterator i = s.iterator();
		System.out.println("Iterating through the LinkedHashMap:");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}

public class IteratorDemo {

	public static void main(String[] args) {
		LinkedhashMap lhm = new LinkedhashMap();
		lhm.addItems();
		lhm.displayMap();
		lhm.iterate();

	}

}
