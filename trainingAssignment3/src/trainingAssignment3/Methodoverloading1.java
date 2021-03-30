package trainingAssignment3;

import java.util.Scanner;

class tuition {
	void subjects(String sub1, String sub2, String sub3) {
		System.out.println("Subjects available: 1. " +sub1+ " 2. " +sub2+ " 3. " +sub3);
	}
	void subchosen(String sub) {
		System.out.println("Subject chosen by the student is: " +sub);
	}
	void subchosen(String sub1, String sub2) {
		System.out.println("Subjects chosen by the student are: " +sub1 + "and " +sub2);
	}
	void subchosen(String sub1, String sub2, String sub3) {
		System.out.println("Subjects chosen by the student are: " +sub1 + ", " +sub2+ "and " +sub3);
	}
	
	String Fees(int fee) {
		System.out.println("Fee for the course is: $" +fee);
		return "paid";
	}
}

public class Methodoverloading1 {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the subjects:");
		tuition programmasters = new tuition();
		programmasters.subjects(s.next(),s.next(),s.next());
		System.out.println("Enter the subjects chosen:");
		programmasters.subchosen(s.next());
		//String pkg = programmasters.pkgalotment();
		//System.out.println("Package alotted is: " +pkg);
		System.out.println("Enter the fee details: ");
		System.out.println("Fee " +programmasters.Fees(s.nextInt()));
		System.out.println("================");
		
		tuition codesters = new tuition();
		System.out.println("Enter the subjects:");
		codesters.subjects(s.next(),s.next(),s.next());
		System.out.println("Enter the subjects chosen:");
		codesters.subchosen(s.next(),s.next());
		System.out.println("Enter the fee details: ");
		System.out.println("Fee " +codesters.Fees(s.nextInt()));
		
		
		
	}

}
