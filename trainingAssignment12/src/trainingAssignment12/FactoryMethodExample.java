package trainingAssignment12;

import java.util.Scanner;

class Appliance{
	Scanner sc = new Scanner(System.in);
	void Costinput() {
		System.out.println("Different applicance costs");
	}
	void features() {
		System.out.println("Different features of Different appliance");
	}
}

class Microwave extends Appliance{
	float cost;
	void Costinput() {
		System.out.println("Enter the minimum Cost of Microwave: ");
		cost = sc.nextFloat();
	}
	void features() {
		System.out.println("Good for Heating, Cooking and Baking at high setting.");
	}
}

class Oven extends Appliance{
	float cost;
	void Costinput() {
		System.out.println("Enter the minimum Cost of Oven: ");
		cost = sc.nextFloat();
	}
	void features() {
		System.out.println("Good for Baking.");
	}
}

class appliancedemo{
	static Appliance getAppliance(String Name) {
		if(Name.equals("Microwave"))
			return new Microwave();
		else if(Name.equals("Oven"))
			return new Oven();
		else 
			return null;		
	}
}

public class FactoryMethodExample {

	public static void main(String[] args) {
		Appliance ap = appliancedemo.getAppliance("Oven");
		ap.Costinput();
		ap.features();

	}

}
