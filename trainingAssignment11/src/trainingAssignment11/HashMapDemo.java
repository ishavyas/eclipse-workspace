package trainingAssignment11;

import java.util.HashMap;
import java.util.Scanner;

class Hashmap{
	HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	Scanner sc= new Scanner(System.in);
	
	void addItems() {
		System.out.println("Enter the elements if the HashMap");
		hmap.put(sc.nextInt(), sc.next());
		hmap.put(sc.nextInt(), sc.next());
		hmap.put(sc.nextInt(), sc.next());
		hmap.put(sc.nextInt(), sc.next());
		hmap.put(sc.nextInt(), sc.next());
	}
	
	void display() {
		System.out.println(hmap);
	}
	
	void getItem() {
		int i;
		System.out.println("Enter the key:");
		i = sc.nextInt();
		System.out.println(hmap.get(i));
	}
	
	void removeItem() {
		int i;
		System.out.println("Enter the index to be removed: ");
		i = sc.nextInt();
		hmap.remove(i);
		System.out.println(hmap);
	}
	
	void size() {
		System.out.println("Enter the elements if the HashMap");
		hmap.put(sc.nextInt(), sc.next());
		hmap.put(sc.nextInt(), sc.next());
		hmap.put(sc.nextInt(), sc.next());
		System.out.println("The size of the HashMap is: "+hmap.size());
		System.out.println(hmap);		
	}
	
	void clearmap() {
		hmap.clear();
		System.out.println(hmap);
	}
	
	void isEmptycheck() {
		if(hmap.isEmpty())
			System.out.println("The HashMap is empty");
		else
			System.out.println("The HashMap is not empty");
	}
	
	void checkElement() {
		int i;
		System.out.println("Enter the key to check elements:");
		i = sc.nextInt();
		if(hmap.containsKey(i))
			System.out.println("Yes it contains i " +i+ "And it contains the value " +hmap.get(i));
		else
			System.out.println("It does not contains i "+i);
		
	}
	
	void replaceItem() {
		int i;
		String j = "";
		System.out.println("Enter the index to be replaced: ");
		i = sc.nextInt();
		System.out.println("Enter the value to be replaced with: ");
		j = sc.next();
		hmap.replace(i,j);
		System.out.println(hmap);
	}
	
}

public class HashMapDemo {

	public static void main(String[] args) {
		
		Hashmap hm = new Hashmap();
		hm.isEmptycheck();
		hm.addItems();
		hm.isEmptycheck();
		hm.display();
		hm.removeItem();
		hm.getItem();
		hm.size();
		hm.checkElement();
		hm.replaceItem();
		hm.clearmap();
		hm.isEmptycheck();

	}

}
