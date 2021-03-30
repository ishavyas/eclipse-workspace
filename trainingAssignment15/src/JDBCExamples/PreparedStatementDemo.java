package JDBCExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jnitproject";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url,username,password);
		if(con!=null) 
			System.out.println("Connection Established");
		
		PreparedStatement p = con.prepareStatement("insert into Customer values(?, ?)");
		p.setInt(1, 2658);
		p.setString(2, "Noah");
		int x = p.executeUpdate();
		if(x!=0)
			System.out.println("Record Inserted");
		
		PreparedStatement ps = con.prepareStatement("update Customer set CustName = ? where CustID = ?");
		ps.setString(1, "Jane");
		ps.setInt(2, 4587);
		x = ps.executeUpdate();
		if(x!=0)
			System.out.println("Record Updated");
		
		PreparedStatement pst = con.prepareStatement("delete from Employee where EmpID = ?");
		pst.setInt(1, 8763);
		x = pst.executeUpdate();
		
		if(x!=0)
			System.out.println("Record Deleted");
		
		PreparedStatement prst = con.prepareStatement("select * from Customer");
		ResultSet rt =  prst.executeQuery();
		while(rt.next())
			System.out.println(rt.getInt(1)+ " "+rt.getString(2));
		
		
	}

}
