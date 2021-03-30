package Assignment1;

class Store{
	void deptnames() {
		System.out.println("The department names are: Clothes, Household, Automobile, "
				+ "Eatables, Nursery, Florists, Accesories, Footware.");
	}
	class Clothings {
		void ColthingSections() {
			System.out.println("Clothings contain 3 seactions: Men's Wear, Women's Wear, Kids Wear");
		}
	}
		
	class florists{
		void flowers() {	
			System.out.println("Different varieties of fresh Flower Bouquet Available.");
		}
	}
	class Household{
		void HouseholdSections() {
			System.out.println("Different household sections are: Kitchen, Dining, Bedding, Bath, Laundry ");
		}
	}
	
	class Automobile{
		void autosections() {
			System.out.println("Automobile Sections include: Oil and Lubricants, Auto Accesories, Cleaning Accesories. ");
		}
	}
	
	abstract class Eatables{
		abstract void sections();
	}
}



public class InnerClassConcept {

	public static void main(String[] args) {
		
		System.out.println("Costco");
		Store Costco = new Store();
		Costco.deptnames();
		Store.Clothings cl = Costco.new Clothings();
		cl.ColthingSections();
		Store.florists fl = Costco.new florists();
		fl.flowers();
		Store.Household hse = Costco.new Household();
		hse.HouseholdSections();
		Store.Automobile au = Costco.new Automobile();
		au.autosections();
		Store.Eatables eat = Costco.new Eatables() {
			void sections() {
				System.out.println("Eatables include: Frozen, Fresh Vegetables, Dairy products, Poultry products, Spices, Essentials");
			}
		};
		eat.sections();
		
		System.out.println("==========================================");
		
		System.out.println("Walmart");
		Store Walmart = new Store();
		Walmart.deptnames();
		Store.Household walh = Walmart.new Household();
		walh.HouseholdSections();
		Store.florists walf = Walmart.new florists();
		walf.flowers();
		Store.Clothings walc = Walmart.new Clothings();
		walc.ColthingSections();
		Store.Automobile walau = Walmart.new Automobile();
		walau.autosections();
		Store.Eatables waleat = Walmart.new Eatables() {
			void sections() {
				System.out.println("Eatables range from oils, Essentials, canned, Frozen , Dairy, Meat, Vegetables, Spices");
			}
		};
		waleat.sections();

	}

}
