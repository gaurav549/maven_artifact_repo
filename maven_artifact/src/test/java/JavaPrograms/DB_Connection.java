package JavaPrograms;

import java.sql.*;

public class DB_Connection {
	
	public static void main (String args[])
	{
		new DB_Connection().db_export();
		
	}
	
	public void db_export() {
		
		String url="jdbc:oracle:thin:SYSTEM/@localhost:1521:tech";
		//String username = "SYSTEM";
	//	String password="password";
		try (Connection conn = DriverManager.getConnection(url))
		{
			System.out.println(conn);
			String src_sql="SELECT * FROM EMPLOYEE";
			Statement stm1 = conn.createStatement();
			ResultSet rs = stm1.executeQuery(src_sql);
			System.out.println(rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
