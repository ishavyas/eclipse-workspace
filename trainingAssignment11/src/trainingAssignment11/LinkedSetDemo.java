package trainingAssignment11;

import java.util.LinkedHashSet;

class LinkedhashsetDemo{
	LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();
	
	void addElement() {
		lhset.add(40);
		lhset.add(20);
		lhset.add(14);
		lhset.add(65);
	}
	
	void display() {
		System.out.println(lhset);
	}
	void removeElements() {
		lhset.remove(14);
		System.out.println(lhset);
	}
	void checkElement() {
		if(lhset.contains(65))
			System.out.println("true");
		else
			System.out.println("false");
	}
	void checkSize() {
		lhset.add(32);
		lhset.add(54);
		lhset.add(05);
		System.out.println("The Size of the LinkedHashSet is: "+lhset.size());
		System.out.println(lhset);
	}
	
	void isEmptyCheck() {
		System.out.println("Is the LinkedHashset empty? " +lhset.isEmpty());
	}
	void ClearSet() {
		lhset.clear();
		System.out.println(lhset);
	}
}

public class LinkedSetDemo {

	public static void main(String[] args) {
		
		LinkedhashsetDemo ldh = new LinkedhashsetDemo();
		ldh.isEmptyCheck();
		ldh.addElement();
		ldh.isEmptyCheck();
		ldh.display();
		ldh.removeElements();
		ldh.checkElement();
		ldh.checkSize();
		ldh.ClearSet();
		ldh.isEmptyCheck();
	}

}
