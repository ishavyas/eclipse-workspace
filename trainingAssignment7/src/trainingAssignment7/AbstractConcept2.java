package trainingAssignment7;

abstract class animal{
	abstract void traits();
	abstract void eatinghabbits();
	void live() {
		System.out.println("Live on land. Hence are terrestial animals");
	}
}

class Canines extends animal{

	@Override
	void traits() {
		System.out.println("Canines can be domesticated and tamed as pets. Dogs, Wolves, Foxes etc.");
		
	}

	@Override
	void eatinghabbits() {
		System.out.println("Canines are Carnivores. Domesticated canines do not hunt but the Wild Canines do.");		
	}
	
}

class Hyenas extends animal{

	@Override
	void traits() {
		System.out.println("Hyenas are the only animal that can laugh.");
		
	}

	@Override
	void eatinghabbits() {
		System.out.println("Hyenas Are Carnivores. They hunt other animals for food.");
		
	}
	
}

class elephant extends animal{

	@Override
	void traits() {
		System.out.println("Elephants are quite human friendly. They weigh in tonns.");
		
	}

	@Override
	void eatinghabbits() {
		System.out.println("Elephants Are Herbivores. They survive by eating plants.");
		
	}
	
}


public class AbstractConcept2 {

	public static void main(String[] args) {
		animal an;
		an = new Canines();
		an.live();
		an.traits();
		an.eatinghabbits();
		an = new Hyenas();
		an.live();
		an.traits();
		an.eatinghabbits();
		an = new elephant();
		an.live();
		an.traits();
		an.eatinghabbits();
	}

}
