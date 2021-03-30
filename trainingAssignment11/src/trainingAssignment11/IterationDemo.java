package trainingAssignment11;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class ListIteration{
	ArrayList<Integer> list = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	void addlistelements() {
		System.out.println("Enter the elements in the ArrayList:");
		
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
	}
	
	void displayList() {
		System.out.println(list);
	}
	
	void iterateList() {
		ListIterator<Integer> i = list.listIterator();
		System.out.println("Iteration over ArrayList:");
		while(i.hasNext()) {
			System.out.println(i.next());
		}		
		System.out.println("Reverse Iteration over ArrayList");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}	
}

public class IterationDemo {

	public static void main(String[] args) {
		ListIteration li = new ListIteration();
		li.addlistelements();
		li.displayList();
		li.iterateList();
	}

}
