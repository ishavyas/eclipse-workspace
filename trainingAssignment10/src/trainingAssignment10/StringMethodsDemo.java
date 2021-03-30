package trainingAssignment10;

import java.util.Scanner;

class Demo{
	//method1
	void display(String s) {	
    	System.out.println(s);
	}
	//method2
	void StringConcatDemo(String s) {
		String s1 = s.concat("Mehod Demo");
		System.out.println(s1);
	}
	//method3
	void StringLengthDemo(String s) {
			System.out.println("length of the String is: " +s.length());
	}
	//method4
	void CharAtDemo(String s, int i) {
		System.out.println("Character at index " +i+ " is: " +s.charAt(i));
	}
	//method5
	void EqualsDemo(String s, String s1){
		System.out.println(s1.equals(s));
		System.out.println("If the uppercase and lowercase are ignored:");
		System.out.println(s1.equalsIgnoreCase(s));
	}
	//method6
	void ReplaceDemo() {
		String s1 = "Demo";
		System.out.println("Before Replacement: "+s1);
		System.out.println("After replacement:" +(s1.replace('m','M')));
	}
	//method7
	void SubstringDemo(String s, int i, int j) {
		System.out.println("The substring is: "+s.substring(i));
		System.out.println("The substring now is: " +s.substring(i, j));
	}
	//method8
	void SplitDemo() {
		String s1 = "This is a demo of the split method";
		System.out.println(s1);
		String[] s2 = s1.split(" ");		
		for(String str : s2) {
			System.out.println(str);
		}
	}
	//method9
	void CaseConversionDemo(String s) {
		System.out.println("The UppercaseConversion for the String is: "+s.toUpperCase());
		System.out.println("the LowecaseConcersion of the String is: "+s.toLowerCase());
	}
	
	//method10
	void TrimDemo() {
		String str = "   TrimMethodDemo  ";
		System.out.println(str);
		System.out.println("String after trim: ");
		System.out.println(str.trim());
	}	
}

public class StringMethodsDemo {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.SplitDemo();
		d.ReplaceDemo();
		d.TrimDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.next();
		d.display(s);
		d.StringConcatDemo(s);
		d.StringLengthDemo(s);
		d.CaseConversionDemo(s);
		System.out.println("Enter the index:");
		int i = sc.nextInt();
		d.CharAtDemo(s, i);
		System.out.println("Enter another index:");
		int j = sc.nextInt();
		d.SubstringDemo(s, i, j);
		System.out.println("Enter the second String s1: ");
		String s1 = sc.next();
		d.EqualsDemo(s, s1);		

	}

}
