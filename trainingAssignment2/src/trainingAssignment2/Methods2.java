package trainingAssignment2;

class tuition {
	void subjects() {
		System.out.println("Package available: 1.Silver- Beginners, 2.Golden- Intermediate, 3.Platinum - Advanced ");
		System.out.println("Subjects available: 1.Java for Beginners, 2.Java for intermediate, 3.Advanced Application Development");
	}
	void subchosen(String sub) {
		System.out.println("Subject chosen by the student is: " +sub);
	}
	String pkgalotment() {
		return "Silver for Java for Beginners";
	}
	String Fees(int fee) {
		System.out.println("Fee for the course is: $" +fee);
		return "paid";
	}
}

public class Methods2 {
	public static void main(String args[]) {
		tuition programmasters = new tuition();
		programmasters.subjects();
		programmasters.subchosen("Java for Beginners");
		String pkg = programmasters.pkgalotment();
		System.out.println("Package alotted is: " +pkg);
		System.out.println("Fee " +programmasters.Fees(500));
		
		
		
	}

}
