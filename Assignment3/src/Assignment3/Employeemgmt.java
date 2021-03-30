package Assignment3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

class Employee{
	int empId;
	String empName;
	String empEmail;
	String empGender;
	float salary;
	void GetEmployeeDetails() {

		System.out.println( "Employee ID: " +empId+" Employee Name: " +empName+ " Employee Email: " +empEmail+
				" Employee Gender: " +empGender+ " Salary: " +salary);			
	}	
	Employee(int i, String n, String e, String g, float s) {
		empId = i;
		empName = n;
		empEmail = e;
		empGender = g;
		salary = s;
	}		
}

class EmployeeDB{
	ArrayList <Employee>list;
	
	EmployeeDB(){
		list = new ArrayList<Employee>();
	}
	
	boolean addEmployee(Employee emp) {
		list.add(emp);
		return true;	
	}
		
	boolean deleteEmployee(int empId) {	
		Iterator<Employee> it = list.iterator();
		
		int in = 0;
		
		while(it.hasNext()) {
			if(it.next().empId == empId) {
				list.remove(in);
				return true;
			}
			in++;
		}		
		return false;
	}
	
	String showPayslip(int empId) {
		
		for(int i=0; i<list.size(); i++) {
			Employee tmp = list.get(i);
			if(tmp.empId == empId) {
				return String.valueOf(tmp.salary);
			}			
		}
		return "";
	}
	
	void printAll() {
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			it.next().GetEmployeeDetails();
		}
	}
}

public class Employeemgmt {

	public static void main(String[] args) {
		
		EmployeeDB edb = new EmployeeDB();
		
		edb.addEmployee(new Employee(1,"First", "first.com","Male", (float)52.3));
		edb.addEmployee(new Employee(2,"Second", "second.com","Male", (float)965.9));
		edb.addEmployee(new Employee(3,"Third", "third.com","Male", (float)153.6));
		edb.addEmployee(new Employee(4,"Fourth", "fourth.com","Male", (float)235.2));
		
		edb.printAll();
		
		System.out.println("Deleting employee with ID 5");
		
		if(edb.deleteEmployee(5)) {
			System.out.println("\nDelete successful.\n");
		}
		else {
			System.out.println("\nEmployee does not exist.\n");
		}
		
		edb.printAll();
		
		
		System.out.println("Salary of Employee with id 2: $" + edb.showPayslip(2) );
		
	}

}
