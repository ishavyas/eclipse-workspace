package trainingAssignment11;

import java.util.Scanner;
import java.util.LinkedList;

class Linkedlists{
	LinkedList<Integer> list = new LinkedList<Integer>(); 
	Scanner sc = new Scanner(System.in);
	
	void addItem() {
		System.out.println("Enter elements to the list");
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
	}
	
	void displayItems() {
		System.out.println(list);
	}
	void removeItem() {
		int i;
		System.out.println("Enter an index to be removed: ");
		i = sc.nextInt();
		list.remove(i);
		System.out.println(list);
	}
	void listSize() {
		System.out.println("Enter elements to the list");
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		System.out.println(list);
		System.out.println("The size of the LinkedList is: " +list.size());
	}
	
	void getItem() {
		int i;
		System.out.println("Enter an index: ");
		i = sc.nextInt();
		System.out.println("Element at index i " +i+ " is: " +list.get(i));
	}
	void checkItem() {
		int i;
		System.out.println("Enter an item to be checked: ");
		i = sc.nextInt();
		if(list.contains(i)) 
			System.out.println("true");
		else
			System.out.println("false");
	}
	void getindex() {
		int j;
		System.out.println("Enter the number: ");
		j = sc.nextInt();
		if(list.contains(j))
			System.out.println("The index of the element j " +j+ " is: " +list.indexOf(j));
		else
			System.out.println("The ArrayList does not contain " +j);
	}
	
	void replaceitem() {
		int k;
		System.out.println("Enter an index to be replaced by 64 ");
		k = sc.nextInt();
		list.set(k, 64);
		System.out.println(list);
	}
	
	void subList() {
		System.out.println(list.subList(2, 4));
	}
	
	void isEmptycheck() {
		if(list.isEmpty()) 
			System.out.println("The list is Empty");
		else
			System.out.println("The list is not Empty");
	}
	
	void clearItems() {
		list.clear();
		System.out.println(list);
	}
}

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Linkedlists ld = new Linkedlists();
		ld.isEmptycheck();
		ld.addItem();
		ld.isEmptycheck();
		ld.displayItems();
		ld.removeItem();
		ld.listSize();
		ld.getItem();
		ld.getindex();
		ld.checkItem();
		ld.replaceitem();
		ld.subList();
		ld.clearItems();
		ld.isEmptycheck();

	}

}
