package Assignment1;

import java.util.Scanner;

class Reverse{
	int revnum(int num) {
		int reversed = 0;
		while(num!=0) {
			int n = num%10;
			reversed = reversed*10 + n;
			num/=10;
		}	
		if(reversed<=Integer.MAX_VALUE || reversed>=Integer.MIN_VALUE) {
			return reversed;
		}
		else {
			return reversed = 0;
		}
			
	}
}
public class Reversenumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed: ");
		int i = sc.nextInt();
		Reverse rev = new Reverse();	
		System.out.println("The Reversed number is: "+rev.revnum(i));

	}

}
