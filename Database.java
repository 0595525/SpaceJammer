import java.sql.*;

public class Database {

   public static void main( String args[] ) {
      Connection c = null;
      Statement stmt = null;
      
	//Try and catch error exception handling   
      try {
	 
	 //Getting connection
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:test.db"); 
         System.out.println("Opened database successfully"); //Printing out database creation message
         
	  // Creating statement    
         stmt = c.createStatement();
	      
	 // Createing a table Score
         String sql = "CREATE TABLE SCORE " +
                        "(SCORE INT PRIMARY KEY     NOT NULL)"; 
         stmt.executeUpdate(sql);
         stmt.close(); //Closing statement
         c.close(); //Closing connection
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Table created successfully"); //Printing out table creation message
   }
}
