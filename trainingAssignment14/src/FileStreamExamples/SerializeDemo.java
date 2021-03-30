package FileStreamExamples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	int empid;
	String empName;
	float Salary;
	public Employee(int id, String name, float sal) {
		//super();
		this.empid = id;
		this.empName = name;
		this.Salary = sal;
	}
}

public class SerializeDemo{
	
	public static void main(String agrs[]) throws IOException {
		Employee abc = new Employee(2036,"James", 4000.00f);
		FileOutputStream fots = new FileOutputStream("D:\\EmpFiles\\empfiles.txt");
		ObjectOutputStream os = new ObjectOutputStream(fots);
		os.writeObject(abc);
		os.flush();
		os.close();
		
	}
}