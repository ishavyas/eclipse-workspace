package Assignment2;

import java.util.Scanner;

class Palindrome{
	String check(String s) {
		String reverse = "";
		for(int i = s.length()-1; i>=0; i--) {
			reverse += s.charAt(i);
		}
		if(s.equals(reverse)) 
			return "Yes, The String is a Palindrome";
		else 
			return "No, The String is not a Palindrome";
	}
	
}

public class PalindromeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.next();
		Palindrome pal = new Palindrome();
		System.out.println(pal.check(s));

	}

}
