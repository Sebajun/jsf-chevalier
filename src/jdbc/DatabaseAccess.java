package jdbc;

import java.sql.*;

public class DatabaseAccess {
	
	 private static Connection connect() throws SQLException
	 {
		 Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsf-chevalier","root","");
		return myConn;
	 }
	 
	 public static ResultSet executeQuery(String query) throws SQLException
	 {
		 Connection myConn = connect();
		 Statement myStmt = myConn.createStatement();
		 ResultSet myRs = myStmt.executeQuery(query);
		 return myRs; 
	 }

}
