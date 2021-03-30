package trainingAssignment1;

class Customer{
	int custID;
	static int AgentID;
	static String AgentName;
	String Destination;
	float ticketchrg;	
}


public class Variables2 {
	public static void main(String args[]){
		
		Customer.AgentID = 45786;
		Customer.AgentName = "Anne Brooks";
		
		Customer Tony = new Customer();
		Tony.custID = 45714;
		Tony.Destination = "New York";
		Tony.ticketchrg = 139.99f;
		
		System.out.println("CustomerID:" + Tony.custID);
		System.out.println("Destination:" + Tony.Destination);
		System.out.println("AgentID:" + Tony.AgentID);
		System.out.println("Agent Name:" + Tony.AgentName);
		System.out.println("Ticket Charge:" + Tony.ticketchrg);
		System.out.println("=================================");
		
		Customer Nancy = new Customer();
		Nancy.custID = 87695;
		Nancy.Destination = "Chicago";
		Nancy.ticketchrg = 219.75f;
		
		System.out.println("CustomerID:" + Nancy.custID);
		System.out.println("Destination:" + Nancy.Destination);
		System.out.println("AgentID:" + Nancy.AgentID);
		System.out.println("Agent Name:" + Nancy.AgentName);
		System.out.println("Ticket Charge:" + Nancy.ticketchrg);
		System.out.println("=================================");
		
		
	}

}
