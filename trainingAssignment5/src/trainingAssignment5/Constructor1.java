package trainingAssignment5;

import java.util.Scanner;

class University{
	String name;
	University(int ID){
		name = "Lamar University";
		System.out.println("University ID: "+ID);
	}
	void output() {
		System.out.println("Unversity Name: " +name);		
	}
}

final class College extends University{
	String clgName;
	int clgID;
	College(String clgName, int clgID){
		super(457);
		this.clgName = clgName;
		this.clgID = clgID;
	}
	Scanner sc = new Scanner(System.in);
	
	void Fees() {
		float fee;
		System.out.println("College Name: "+clgName);
		System.out.println("College ID: "+clgID);
		System.out.println("Enter the Fees");
		fee = sc.nextFloat();
		System.out.println("Payment of $" +fee+ " made.");
		
	}
}

class program{
	final int progID = 104;
	program(String progName) {		
		System.out.println("Program Name: " +progName);
		System.out.println("Program ID: " +progID);
	}
	
	
}

public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College Arts = new College("College of Arts and Science", 4015);
		Arts.output();
		Arts.Fees();		
		program pr = new program("Computer Science");
		

	}

}
