package JavaPrograms;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class DB_Connection {

	public static void main (String args[])
	{
		new DB_Connection().db_export();
		
	}

	public void db_export() {
		
		String url="jdbc:oracle:thin:@localhost:1521:tech";
		String username = "SYSTEM";
	    String password="Unicorn@12345";
		try (Connection conn = DriverManager.getConnection(url,username, password))
		{
			//System.out.println(conn);
			ArrayList<String> al = new ArrayList();
			String src_sql="SELECT * FROM EMPLOYEE";
			Statement stm1 = conn.createStatement();
			ResultSet rs = stm1.executeQuery(src_sql);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			for ( int j=1; j<=columnsNumber; j++)
			{
				al.add(rsmd.getColumnName(j) );
			
	    	//System.out.print( rsmd.getColumnName(j)  + "|" );

			}
			System.out.print( " Column Array List:" + al );
			  System.out.println("");
			while (rs.next()) {
			    for (int i = 1; i <= columnsNumber; i++) {
			    	rs.getString(1);
			
			        if (i > 1) System.out.print("|");
			        String columnValue = rs.getString(i);
			        System.out.print(columnValue + "" );
			    }
			    System.out.println("");
			} 
			}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}




