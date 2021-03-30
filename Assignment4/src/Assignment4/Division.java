package Assignment4;

import java.util.Scanner;

class Divide{
		
	int IntegerDivision(int dividend, int divisor) {
		int sign;
		if(dividend<0 || divisor<0)
			sign = -1;
		else
			sign = 1;
		
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		
		int quo = 0;
		while(dividend>=divisor) {
			dividend = dividend -divisor;
			++quo;
		}
		return sign*quo;
	}
}

public class Division {

	public static void main(String[] args) {
		Divide d = new Divide();
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter the dividend:");
		a= sc.nextInt();
		System.out.println("Enter the divisor:");
		b = sc.nextInt();
		System.out.println("The division of following numbers is: "+d.IntegerDivision(a, b));

	}

}
