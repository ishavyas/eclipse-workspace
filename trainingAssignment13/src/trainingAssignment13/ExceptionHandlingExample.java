package trainingAssignment13;

import java.util.Scanner;

class Operations{
	int add(int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	float multiply(int a, int b) {
		float product = a*b;
		return product;
	}
	
	void divide(int a, int b) {
		try {	
			System.out.println(a/b);			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}	
	}
	
	void modulus(int a, int b) {
		try {
			System.out.println(a%b);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}		
	}
}

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		Operations op = new Operations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values of a and b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition: "+op.add(a, b));
		System.out.println("Multiplication: "+op.multiply(a, b));
		System.out.println("Division: ");
		op.divide(a, b);		
		System.out.println("Mod: ");
		op.modulus(a, b);
		

	}

}
