import java.sql.*;

public class Database {
	 public static void main( String args[] ) {
		 String url = "jdbc:sqlite:test.db";
		 String username = "student";
		 String password = "student";
		 
	     
	      
	      try {
	    	  //Get connection with Database
	    	  Connection c = DriverManager.getConnection(url, username, password);
	    	  
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:test.db");
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	   }
}


