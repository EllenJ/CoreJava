package Collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataRetrival{ 


public static void main(String[] args)  {
	  try{
		  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	  
    System.out.println("#- driver loaded");
    
    String server = "localhost\\sqlexpress";
    int port = 1433;
    String user = "cis605_usr";
    String password ="abcd";
   String database = "CIS605";
    //String jdbcUrl = "jdbc:sqlserver://" +server+":"+port+";user="+user+";password="+password+";databaseName="+database+";";
    String url="jdbc:sqlserver://localhost:1433;databaseName=CIS605;integratedSecurity=true";
    // String jdbcUrl ="jdbc:sqlserver://localhost:1433;DatabaseName=CIS605";
  //  String url = "jdbc:microsoft:sqlserver://HOST:1433"+";databaseName=CIS605";
   Connection con = DriverManager.getConnection(url, user, password);

    //Connection m_Connection = DriverManager.getConnection(jdbcUrl);
    System.out.println("#-connection obtained");
    
       // "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=CIS605", "userid", "password");

    Statement m_Statement = con.createStatement();
    String query = "SELECT * FROM employee";

    ResultSet m_ResultSet = m_Statement.executeQuery(query);
	  
	  
    while (m_ResultSet.next()) {
      System.out.println(m_ResultSet.getString(1) + ", " + m_ResultSet.getString(2) + ", "
          + m_ResultSet.getString(3));

    }
	  }
	  catch(Exception ex){
		  System.out.println("error : "+ex);
	  }
	  
  }

}