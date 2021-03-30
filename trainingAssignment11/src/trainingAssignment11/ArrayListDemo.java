package trainingAssignment11;

import java.util.ArrayList;
import java.util.Scanner;

class Arraylist{
	ArrayList<Integer> alist = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	
	void addlistelements() {
		System.out.println("Enter the elements in the ArrayList:");
		alist.add(sc.nextInt());
		alist.add(sc.nextInt());
		alist.add(sc.nextInt());
		alist.add(sc.nextInt());
		alist.add(sc.nextInt());
	}
	
	void displaylist() {
		System.out.println(alist);
	}
	
	void removelistelement() {
		alist.remove(4);
		System.out.println(alist);
	}
	
	void size() {
		System.out.println("Enter the elements in the ArrayList:");
		alist.add(sc.nextInt());
		alist.add(sc.nextInt());
		System.out.println("The size of the ArrayList is: " +alist.size());
	}
	
	void getItem() {
		int i;
		System.out.println("Enter an index: ");
		i = sc.nextInt();
		System.out.println("Element at index i " +i+ " is: " +alist.get(i));
	}
	void checkItem() {
		if(alist.contains(54)) 
			System.out.println("true");
		else
			System.out.println("false");
	}
	void getindex() {
		int j;
		System.out.println("Enter the number: ");
		j = sc.nextInt();
		if(alist.contains(j))
			System.out.println("The index of the element j " +j+ " is: " +alist.indexOf(j));
		else
			System.out.println("The ArrayList does not contain " +j);
	}
	
	void replaceitem() {
		int k;
		System.out.println("Enter an index to be replaced by 100 ");
		k = sc.nextInt();
		alist.set(k, 100);
		System.out.println(alist);
	}
	
	void subList() {
		System.out.println(alist.subList(2, 5));
	}
	
	void isEmptycheck() {
		if(alist.isEmpty()) 
			System.out.println("The list is Empty");
		else
			System.out.println("The list is not Empty");
	}
	
	void clearItems() {
		alist.clear();
		System.out.println(alist);
	}
		
}

public class ArrayListDemo {

	public static void main(String[] args) {
		Arraylist al = new Arraylist();
		al.isEmptycheck();
		al.addlistelements();
		al.isEmptycheck();
		al.displaylist();
		al.removelistelement();
		al.size();
		al.getItem();
		al.getindex();
		al.checkItem();
		al.replaceitem();
		al.subList();
		al.clearItems();
		al.isEmptycheck();
		

	}

}
