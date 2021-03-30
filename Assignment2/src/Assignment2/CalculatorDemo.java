package Assignment2;

import java.util.Scanner;

class Calculator {
	static int powerInt(int num1, int num2) {
		int res = 0;
		res = (int) Math.pow(num1, num2);
		return res;
		
	}
	
	static double powerInt(double num1, int num2) {
		double res = 0;
		res = Math.pow(num1, (double)num2);
		return res;
	}
}



public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers a and b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator cal = new Calculator();		
		System.out.println("Result of  "+a+" to the power of  " +b+ " is: "+cal.powerInt(a, b));
		System.out.println("Enter the value of x: ");
		double x = sc.nextDouble();
		System.out.println("Result of  "+x+" to the power of  " +b+ " is: "+cal.powerInt(x,b));
		
	}

}
