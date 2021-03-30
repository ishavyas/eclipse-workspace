package trainingAssignment6;

class Animal{
	void traits() {
		System.out.println("Diffterent types of Animals have different traits");
	}
	void examples() {
		System.out.println("Examples of animals");
	}
}
class terrestrial extends Animal{
	void traits() {
		System.out.println("They live on land, but cannot breathe in water");
	}
	void examples() {
		System.out.println("DOgs, Cats, Horses");
	}
}
class Aquatic extends Animal{
	void traits() {
		System.out.println("They live in water and cannot survive outside it");
	}
	void examples() {
		System.out.println("Fish, SeaHorse, Jellyfish");
	}
}


public class Methodoverriding2 {
	
	public static void main(String[] args) {
		Animal an = new Animal();
		an.traits();
		an.examples();
		an = new terrestrial();
		an.traits();
		an.examples();
		an = new Aquatic();
		an.traits();
		an.examples();

	}

}
