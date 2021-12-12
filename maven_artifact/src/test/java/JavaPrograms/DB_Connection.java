package JavaPrograms;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class DB_Connection {


	
	public static void main (String args[]) throws SQLException
	{
		String url="jdbc:oracle:thin:@localhost:1521:tech";
		String username = "SYSTEM";
	    String password="Unicorn@12345";
		Connection conn = DriverManager.getConnection(url,username, password);
		new DB_Connection().source_db_export(conn);
		new DB_Connection().target_db_export(conn) ;
		ArrayList<String> tgt_al = new ArrayList<String>() ;
		ArrayList<String> src_al= new ArrayList<String>();
		new DB_Connection(). compare_result(src_al, tgt_al);
		
		
	}

	
	public void source_db_export(Connection conn) throws SQLException {
			//System.out.println(conn);
			ArrayList<String> src_al = new ArrayList();
			String src_sql="SELECT * FROM EMPLOYEE";
			Statement stm1 = conn.createStatement();
			ResultSet rs = stm1.executeQuery(src_sql);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			for ( int j=1; j<=columnsNumber; j++)
			{
				src_al.add(rsmd.getColumnName(j) );
			
	    	//System.out.print( rsmd.getColumnName(j)  + "|" );

			}
			System.out.print( " Column Array List:" + src_al );
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
	
	public void target_db_export(Connection conn) throws SQLException {
		//System.out.println(conn);
		ArrayList<String> tgt_al = new ArrayList();
		String tgt_sql="SELECT * FROM EMPLOYEE";
		Statement stm1 = conn.createStatement();
		ResultSet rs = stm1.executeQuery(tgt_sql);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		for ( int j=1; j<=columnsNumber; j++)
		{
			tgt_al.add(rsmd.getColumnName(j) );
		
    	//System.out.print( rsmd.getColumnName(j)  + "|" );

		}
		System.out.print( " Column Array List:" + tgt_al );
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
		
	public boolean compare_result(ArrayList<String>src_al, ArrayList<String> tgt_al) {
		
		boolean final_result = src_al.equals(tgt_al);
		System.out.println(final_result);
		return final_result ;
		
		
		
	} 
}
	




