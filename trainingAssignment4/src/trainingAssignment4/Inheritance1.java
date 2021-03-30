package trainingAssignment4;
import java.util.Scanner;

class Operations{
	int a;
	float b;
	Scanner s = new Scanner(System.in);
	void input() {
		System.out.println("Enter the values of a and b: ");
		a = s.nextInt();
		b = s.nextFloat();
	}
	void add() {
		System.out.println("the sum is: " +(a+b));
	}
}



class Product extends Operations{
	int c;
	void prodinput() {
		System.out.println("Enter the value of c: ");
		c = s.nextInt();
	}
	void multiply() {
		System.out.println("the product is: " +(a*b*c));
	}
}


public class Inheritance1 {

	public static void main(String[] args) {
		Product p = new Product();
		p.input();
		p.add();
		p.prodinput();
		p.multiply();
	}

}
