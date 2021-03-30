package trainingAssignment11;

import java.util.Scanner;
import java.util.Stack;

class StackList{
	Stack<Integer> s = new Stack<Integer>();
	Scanner sc = new Scanner(System.in);
	
	void addItem() {
		System.out.println("Enter the elements in the stack: ");
		s.push(sc.nextInt());
		s.push(sc.nextInt());
		s.push(sc.nextInt());
		s.push(sc.nextInt());
		s.push(sc.nextInt());
	}
	void displayStack() {
		System.out.println(s);
	}
	void removeItem() {
		s.pop();
		System.out.println(s);
	}
	void stackSize() {
		System.out.println("Enter the elements in the stack: ");
		s.push(sc.nextInt());
		s.push(sc.nextInt());
		System.out.println("Size of this Stack is: " +s.size());
		System.out.println(s);
	}
	void peekItem() {
		System.out.println(s.peek());
	}
	void stackSearch() {
		int i;
		System.out.println("Enter an element to check");
		i = sc.nextInt();
		System.out.println("Does this Stack contains " +i+ "? " +s.search(i)+ "is the index number of i" +i);
	}
	
	void clearItem() {
		s.clear();
		System.out.println(s);
	}
	
	void isEmptycheck() {
		if(s.isEmpty()) 
			System.out.println("The Stack is empty");
		else
			System.out.println("The Stack is not empty");
	}
	
}

public class StackDemo {

	public static void main(String[] args) {
		StackList sl = new StackList();
		sl.isEmptycheck();
		sl.addItem();
		sl.displayStack();
		sl.removeItem();
		sl.stackSize();
		sl.peekItem();
		sl.stackSearch();
		sl.clearItem();
		sl.isEmptycheck();

	}

}
