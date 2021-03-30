package com.EmployeeManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.EmployeeManagement.Employee;

public class EmpDeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("D://EmpFiles/emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = (Employee)ois.readObject();
		System.out.println("EmpName: " +e.empName+ " Date of Birth: " +e.dateOfBirth+ " Department: " +e.department+ 
				" Designation: " +e.Designation+ " Salary: " +e.Salary);
		

	}

}
