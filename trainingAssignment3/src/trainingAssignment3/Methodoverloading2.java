package trainingAssignment3;
import java.util.Scanner;

class operation{
	void add(int x, float y) {
		System.out.println("The sum is: "+(x+y));
	}
	void add(float x, int y) {
		System.out.println("The sum is: "+(x+y));
	}
	void sub(float x, float y) {
		System.out.println("The difference is: "+(x-y));
	}
	void sub(int x, int y) {
		System.out.println("The difference is: "+(x-y));
	}
	void multiply(int x, int y) {
		System.out.println("The multiplication is: "+(x*y));
	}
	void multiply(int x, int y, int z) {
		System.out.println("The multiplication is: "+(x*y*z));
	}
}

public class Methodoverloading2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		operation ops = new operation();
		ops.add(sc.nextInt(), sc.nextFloat());
		System.out.println("Enter the values:");
		ops.sub(sc.nextFloat(), sc.nextFloat());
		System.out.println("Enter the values:");
		ops.multiply(sc.nextInt(), sc.nextInt());
		
		System.out.println("================================");
		System.out.println("Enter the values:");
		operation ops2 = new operation();
		ops2.add(sc.nextFloat(), sc.nextInt());
		System.out.println("Enter the values:");
		ops.sub(sc.nextInt(), sc.nextInt());
		System.out.println("Enter the values:");
		ops.multiply(sc.nextInt(), sc.nextInt(), sc.nextInt());
	}
}
