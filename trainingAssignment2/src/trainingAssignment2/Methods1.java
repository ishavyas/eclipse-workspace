package trainingAssignment2;


class library{
	void booklist() {
		System.out.println("1.Fundamentals of Chemistry 2. Fun with Maths 3. History Facts and More");
	}
	void orderBooks(String book, int qty) {
		System.out.println("Book ordered is: " + book + " in quantity: " +qty);
	}
	String deliveredBooks() {
		return "Fun with Maths";
	}
	String payment(int amt, int qty) {
		System.out.println("Payment is: " +(amt*qty));
		return "recieved";
	}
}


public class Methods1 {
	public static void main(String args[]) {
		library StJohn = new library();
		StJohn.booklist();
		StJohn.orderBooks("Fun with Maths", 5);
		String bookName = StJohn.deliveredBooks();
		System.out.println("Book Delivered is:" +bookName);
		System.out.println("Payment " + StJohn.payment(10, 5));		
	}

}
