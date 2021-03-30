package trainingAssignment5;
import java.util.Scanner;

class Company{
	int ID;
	String compName;
	Company(){
		ID = 4045;
		compName = "MVS Infotech"; 
	}
	void display() {
		System.out.println("Company ID: " +ID);
		System.out.println("Company Name: " +compName);
	}
}

class Department extends Company{
	int deptID;
	String deptName;
	Department(int deptID, String deptName){
		this.deptID = deptID;
		this.deptName = deptName;
	}
	void deptdisplay() {
		System.out.println("Department ID: " +deptID);
		System.out.println("Department Name: " +deptName);
	}
}

final class Employee extends Department{
	int EmpID;
	String EmpName;
	Scanner sc = new Scanner(System.in);
	Employee(int deptID, String deptName){
		super(deptID, deptName);
		System.out.println("Enter Employee ID and Name: ");
		EmpID = sc.nextInt();
		EmpName = sc.next();
	}
	void empDisplay() {
		System.out.println("Below are the complete employee details:");
		System.out.println("EmpID: "+EmpID+ " EmpName: " +EmpName+ " DeptID: " +deptID+ 
				" DeptName: " +deptName+  " CompID: " +ID+ " CompanyName: " +compName);
		
	}
}



public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(4501, "IT");
		emp.display();
		emp.deptdisplay();
		emp.empDisplay();
	}

}
