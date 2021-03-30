package com.EmployeeManagement;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.EmployeeManagement.Employee;

public class EmpSerializationDemo {

	public static void main(String[] args) throws ParseException, IOException {
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		String dob = "1995-12-10";
		Date date = dateFormatter.parse(dob);
		Employee empf = new Employee("Jame", date, "HR", "Manager", 40000);
				
		FileOutputStream fos = new FileOutputStream("D:\\EmpFiles/emp.txt"); 
		ObjectOutputStream obj = new ObjectOutputStream(fos);
		
		obj.writeObject(empf);
		obj.flush();
		obj.close();

	}

}
