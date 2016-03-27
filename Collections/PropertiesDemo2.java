package Collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class PropertiesDemo2 {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Properties p= new Properties();
		FileInputStream fis=new FileInputStream("db.properties");
		p.load(fis);
		String url=p.getProperty("url");
		String user = p.getProperty("user");
		String pwd = p.getProperty("pwd");
		Connection con= DriverManager.getConnection(url,user,pwd);
		

	}

}
