import java.sql.*;

public class Database {
	 public static void main( String args[] ) {
		 String url = "jdbc:sqlite:test.db";
		 String username = "student";
		 String password = "student";
		 
	     
	      
	      try {
	    	  //Get connection with Database
	    	  Connection c = DriverManager.getConnection(url, username, password);
	  // Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
	    	  //Create a statement
	    	  Statement myScore = c.createStatement();
	    	  
	    	  //Execute sql query
	   /* 	  Class<?> sql = 
	    	  
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:test.db");  */
	    	  
	    	  myScore.execute("CREATE TABLE IF NOT EXISTS scoretable (score INTEGER)");
	    	  myScore.execute("INSERT INTO scoretable (score) VALUES ('{0}')");
	    	  
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	   }
}


