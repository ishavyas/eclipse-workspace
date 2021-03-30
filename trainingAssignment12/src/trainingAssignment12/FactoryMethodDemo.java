package trainingAssignment12;

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

class BankName{
	Bank getBank(String bankName) {
		if(bankName.equals("Chase")) 
			return new Chase();
		else if(bankName.equals("WellsFargo"))
			return new WellsFargo();
		else
			return null;
	}
}

public class FactoryMethodDemo {

	public static void main(String[] args) {
		BankName bn = new BankName();
		Bank b = bn.getBank("Chase");
		b.input();
		b.interest();
	}

}
