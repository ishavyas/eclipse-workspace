package trainingAssignment11;

import java.util.HashSet;
import java.util.Scanner;

class HashDemo{
	HashSet<Integer> hset = new HashSet<Integer>();	
	void addElements() {		
		System.out.println("Enter the Hashset Items:");
		hset.add(40);
		hset.add(75);
		hset.add(28);
		hset.add(15);
	}
	void display() {		
		System.out.println(hset);
	}
	void removeElements() {
		hset.remove(15);
		System.out.println(hset);
	}
	void checkElement() {
		if(hset.contains(40))
			System.out.println("true");
		else
			System.out.println("false");
	}
	void checkSize() {
		hset.add(32);
		hset.add(14);
		System.out.println("The Size of the hashset is: "+hset.size());
		System.out.println(hset);
	}
		
	void isEmptyCheck() {
		System.out.println("Is the Hashset empty? " +hset.isEmpty());
	}
	
	void ClearSet() {
		hset.clear();
		System.out.println(hset);
	}
}

public class HashSetDemo {

	public static void main(String[] args) {
		HashDemo hd = new HashDemo();
		hd.isEmptyCheck();
		hd.addElements();
		hd.isEmptyCheck();
		hd.display();
		hd.removeElements();
		hd.checkElement();
		hd.checkSize();
		hd.ClearSet();
		hd.isEmptyCheck();
	}

}
