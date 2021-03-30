package trainingAssignment8;

interface Vehicle {
	void Gear();
	void speed();
	
}

abstract class Car implements Vehicle{
	
	void sunroof() {
		System.out.println("May contain Sunroof and Moonroof");
	}
	void doors() {
		System.out.println("Contains doors. Number of doors can be 2 or 4");
	}
}

abstract class Bike implements Vehicle{
	void handle() {
		System.out.println("Contains handle to steer the control of the Bike.");
	}
	
	void stand() {
		System.out.println("Contains a stand to park it");
	}
}

class Tesla extends Car{

	@Override
	public void Gear() {
		System.out.println("Tesla, Being an electric car it does not have gear.");
	}

	@Override
	public void speed() {
		System.out.println("Top Speed for a Tesla is: 155-160 miles /hr.");
		
	}	
}

class Ford extends Car{

	@Override
	public void Gear() {
		System.out.println("Ford is a 6-speed automatic car.");
		
	}

	@Override
	public void speed() {
		System.out.println("Top Speed for a Ford is: 160-170 miles /hr");
	}
	
}

class BMW extends Bike{

	@Override
	public void Gear() {
		System.out.println("BMW, Being a Bike it has 6-speed manual transmission.");
	}

	@Override
	public void speed() {
		System.out.println("Top Speed for BMW bike is: 180-190 miles/hr");
		
	}	
}

class Kawasaki extends Bike{

	@Override
	public void Gear() {
		System.out.println("Kawasaki, Being a bike it has a 6-speed manual transmission. ");
		
	}

	@Override
	public void speed() {
		System.out.println("Top speed for Kawasaki is: 175-185 miles/hr");
		
	}	
}

public class Interface1 {

	public static void main(String[] args) {
		Car x;
		x = new Tesla();
		x.doors();
		x.Gear();
		x.speed();
		x.sunroof();
		x = new Ford();
		x.doors();
		x.Gear();
		x.speed();
		x.sunroof();
		
		Bike y;
		y = new BMW();
		y.Gear();
		y.handle();
		y.speed();
		y.stand();
		y = new Kawasaki();
		y.Gear();
		y.handle();
		y.speed();
		y.stand();

	}

}
