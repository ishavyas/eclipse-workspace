package trainingAssignment6;

import java.util.Scanner;

class Bank{
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("ROI");
	}
	void interest() {
		System.out.println("Below are the rate of interest of different banks");	
	}
}
class Chase extends Bank{
	float roi;
	void input() {
		System.out.println("Enter the roi: ");
		roi = sc.nextFloat();
	}	
	void interest() {
		System.out.println("The rate of interest for Chase is: " +roi);
	}
}
class WellsFargo extends Bank{
	float roi;
	void input() {
		System.out.println("Enter the roi");
		roi = sc.nextFloat();
	}
	void interest() {
		System.out.println("The rate of interest for WllsFargo is: " +roi);
	}
}

public class Methodoverriding1 {

	public static void main(String[] args) {
		//Bank bnk = new Bank();
		Bank bnk = new Bank();
		bnk.input();
		bnk.interest();
		bnk= new Chase();
		bnk.input();
		bnk.interest();	
		bnk = new WellsFargo();
		bnk.input();
		bnk.interest();

	}

}
