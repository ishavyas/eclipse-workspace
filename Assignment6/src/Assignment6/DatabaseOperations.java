package Assignment6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseOperations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jnitproject";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url,username,password);
		if(con!=null) 
			System.out.println("Connection Established");
		String operation;
		System.out.println("Select from the following operations:");
		System.out.println("1.Insert 2.Display 3.Update 4.Delete ");
		System.out.println("Enter the  Operation to be performed: ");
		operation = sc.next();
		int x;
		String fname;
		String lname;
		int id;
		int mob;
		String dept;
		String address;
		if(operation.equals("insert") || operation.equals("Insert")) {			
			PreparedStatement p = con.prepareStatement("insert into Details values(?, ?, ?, ?, ?, ?)");
			System.out.println("Enter the ID: ");
			id = sc.nextInt();
			p.setInt(1, id);
			System.out.println("Enter the FirstName: ");
			fname = sc.next();
			p.setString(2,fname);
			System.out.println("Enter the LastName: ");
			lname = sc.next();
			p.setString(3, lname);
			System.out.println("Enter the Mobile: ");
			mob = sc.nextInt();
			p.setInt(4, mob);
			System.out.println("Enter the Address: ");
			address = sc.next();
			p.setString(5, address);
			System.out.println("Enter the Department: ");
			dept = sc.next();			
			p.setString(6, dept);
			x = p.executeUpdate();
			if(x!=0)
				System.out.println("Record Inserted");
		}
		
		else if(operation.equals("Display") || operation.equals("display")) {
			PreparedStatement prst = con.prepareStatement("select * from Details");
			ResultSet rt =  prst.executeQuery();
			while(rt.next()) {
				System.out.println(rt.getInt(1)+ " "+rt.getString(2)+ " "+rt.getString(3)+
						" "+rt.getInt(4)+ " "+rt.getString(5)+ " "+rt.getString(6));
			}
			
		}
		else if(operation.equals("Update") || operation.equals("update")) {
			PreparedStatement ps = con.prepareStatement("update Details set Address = ? where ID = ?");
			System.out.println("Set the new value:");
			address = sc.next();
			ps.setString(1, address);
			System.out.println("Enter the Detail ID to be updated: ");
			id = sc.nextInt();
			ps.setInt(2, id);
			x = ps.executeUpdate();
			if(x!=0)
				System.out.println("Record Updated");
		}
		else if(operation.equals("Delete") || operation.equals("delete")) {
			PreparedStatement pst = con.prepareStatement("delete from Employee where EmpID = ?");
			System.out.println("Select the record ID to be deleted:");
			id = sc.nextInt();
			pst.setInt(1, id);
			x = pst.executeUpdate();
			
			if(x!=0)
				System.out.println("Record Deleted");
			
		}
		
		

	}

}
