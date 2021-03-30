package trainingAssignment9;

class Bank{
	void loan() {
		System.out.println("Low interest Student loans, Home Loans, Vehicle Loans are provided here.");
		Student st = new Student();
		st.Roi();
		
		class Vehicle{
			void rate() {
				System.out.println("Rate of Interst for Vehicle loans starts from 5%. ");
			}
		}
		
		Vehicle v = new Vehicle();
		v.rate();
	}
	class Home{
		void interest() {
			System.out.println("Rate of Interst for Home loans starts from 6%. ");
		}
	}
	class Student{
		void Roi() {
			System.out.println("Rate of Interst for Student loans starts from 4%. ");
		}
	}
	
	static class Personal{
		static void rateofinterest() {
			System.out.println("Rate of Interst for Personal loans starts from 7%. ");
		}
	}
}

abstract class Credit{
	abstract void APR();
}

public class InnerClass1 {

	public static void main(String[] args) {
		Bank Chase = new Bank();
		Chase.loan();
		Bank.Home h = Chase.new Home();
		h.interest();
		Bank.Personal.rateofinterest();
		Credit ch = new Credit() {
			void APR() {
				System.out.println("Chase Credit Cards available on 0% APR for first 14 months");
			}
		};
		ch.APR();

	}

}
