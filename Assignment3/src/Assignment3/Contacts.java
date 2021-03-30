package Assignment3;

import java.util.HashMap;
import java.util.Scanner;

class ContactList{
	HashMap <String, Integer> ContactList = new HashMap<String, Integer>();
	Scanner sc= new Scanner(System.in);
	void addContacts() {
		
		System.out.println("Enter the elements if the HashMap");
		ContactList.put(sc.next(), sc.nextInt());
		ContactList.put(sc.next(), sc.nextInt());
		ContactList.put(sc.next(), sc.nextInt());
		ContactList.put(sc.next(), sc.nextInt());
	}
	
	void displayContacts() {
		System.out.println(ContactList);
	}
	
	void checkKeys(String key) {
		if(ContactList.containsKey(key))
			System.out.println("Yes it contains " +key+ " And it contains the value " +ContactList.get(key));
		else
			System.out.println("It does not contains Key "+key);
	}
	
	void checkValue(int value) {
		if(ContactList.containsKey(value))
			System.out.println("Yes it contains " +value+ " And the key for it is " +ContactList.get(value));
		else
			System.out.println("It does not contains Value "+value);
	}
	
	void iterate() {  
		for (HashMap.Entry<String,Integer> clist : ContactList.entrySet())  
            System.out.println("Key = " + clist.getKey() + ", Value = " + clist.getValue()); 
	}	
}

public class Contacts {

	public static void main(String[] args) {
		 ContactList cl = new ContactList();
		 cl.addContacts();
		 cl.displayContacts();
		 System.out.println("Enter the keys to check:");
		 cl.checkKeys(cl.sc.next());
		 System.out.println("Enter the values to check:");
		 cl.checkValue(cl.sc.nextInt());
		 System.out.println("Iteration over HashMap results");
		 cl.iterate();
	}

}
