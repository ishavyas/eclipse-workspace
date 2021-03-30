package trainingAssignment11;

import java.util.TreeSet;

class Treedemo{
	TreeSet<Integer> tset = new TreeSet<Integer>();
	void add() {
		tset.add(30);
		tset.add(20);
		tset.add(10);
		tset.add(75);
	}
	
	void displaySet() {
		System.out.println(tset);
	}
	void remove() {
		tset.remove(20);
		System.out.println(tset);
	}
	void check() {
		if(tset.contains(10))
			System.out.println("true");
		else
			System.out.println("false");
	}
	void Size() {
		tset.add(45);
		tset.add(25);
		tset.add(18);
		tset.add(81);
		System.out.println("The Size of the TreeSet is: "+tset.size());
		System.out.println(tset);
	}
	
	void subsetDemo() {
		System.out.println(tset.subSet(25,75));
		System.out.println(tset.subSet(25,true,75,true));
	}
	
	
	void isEmptyCheck() {
		System.out.println("Is the Treeset empty? " +tset.isEmpty());
	}
	void Clear() {
		tset.clear();
		System.out.println(tset);
	}
}

public class TreeSetDemo {

	public static void main(String[] args) {
		Treedemo td = new Treedemo();
		td.isEmptyCheck();
		td.add();
		td.isEmptyCheck();
		td.displaySet();
		td.remove();
		td.check();
		td.Size();
		td.subsetDemo();
		td.Clear();
		td.isEmptyCheck();

	}

}
