package JDBCExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExamples {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jnitproject";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url,username,password);
		if(con!=null) 
			System.out.println("Connection Established");
		
		Statement s = con.createStatement();
		String query1 = "insert into Employee values(5897, 'Dave', 70000, 'Production')";
		int x = s.executeUpdate(query1);
		if(x!=0)
			System.out.println("Record Inserted");
		String query2 = "update Employee set empDept = 'Design' where EmpID = '8761'";
		x = s.executeUpdate(query2);
		
		if(x>1)
			System.out.println("Record Updated");
		
		ResultSet rt =  s.executeQuery("select * from Employee");
		while(rt.next())
			System.out.println(rt.getInt(1)+ " "+rt.getString(2)+ " "+rt.getInt(3)+ " " +rt.getString(4));
	}

}

