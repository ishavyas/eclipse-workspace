package trainingAssignment11;

import java.util.Scanner;
import java.util.Vector;

class ListVector{
	Vector<Integer> v = new Vector<Integer>();
	Scanner sc = new Scanner(System.in);
	void addItem() {
		System.out.println("Enter elements to the list");
		v.add(sc.nextInt());
		v.add(sc.nextInt());
		v.add(sc.nextInt());
		v.add(sc.nextInt());
		v.add(sc.nextInt());
		v.add(sc.nextInt());
	}
	
	void displayItems() {
		System.out.println(v);
	}
	void removeItem() {
		int i;
		System.out.println("Enter an index to be removed: ");
		i = sc.nextInt();
		v.remove(i);
		System.out.println(v);
	}
	void listSize() {
		System.out.println("Enter elements to the list");
		v.add(sc.nextInt());
		v.add(sc.nextInt());
		v.add(sc.nextInt());
		System.out.println(v);
		System.out.println("The size of the LinkedList is: " +v.size());
	}
	
	void getItem() {
		int i;
		System.out.println("Enter an index: ");
		i = sc.nextInt();
		System.out.println("Element at index i " +i+ " is: " +v.get(i));
	}
	void checkItem() {
		int i;
		System.out.println("Enter an item to be checked: ");
		i = sc.nextInt();
		if(v.contains(i)) 
			System.out.println("true");
		else
			System.out.println("false");
	}
	void getindex() {
		int j;
		System.out.println("Enter the number: ");
		j = sc.nextInt();
		if(v.contains(j))
			System.out.println("The index of the element j " +j+ " is: " +v.indexOf(j));
		else
			System.out.println("The ArrayList does not contain " +j);
	}
	
	void replaceitem() {
		int k;
		System.out.println("Enter an index to be replaced by 60 ");
		k = sc.nextInt();
		v.set(k, 64);
		System.out.println(v);
	}
	
	void subList() {
		System.out.println(v.subList(2, 4));
	}
	
	void isEmptycheck() {
		if(v.isEmpty()) 
			System.out.println("The list is Empty");
		else
			System.out.println("The list is not Empty");
	}
	
	void clearItems() {
		v.clear();
		System.out.println(v);
	}
}
public class VectorDemo {

	public static void main(String[] args) {
		ListVector LV = new ListVector();
		LV.isEmptycheck();
		LV.addItem();
		LV.isEmptycheck();
		LV.displayItems();
		LV.removeItem();
		LV.listSize();
		LV.getItem();
		LV.getindex();
		LV.checkItem();
		LV.replaceitem();
		LV.subList();
		LV.clearItems();
		LV.isEmptycheck();
	}

}
