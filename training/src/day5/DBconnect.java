package day5;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect//NO PSVM
{
	public static Connection mydbconnect()
	{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		con=
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","Newuser123");
		}
		catch(Exception e)
		{
		System.out.println("Connection Failed! Check console!"+e);	
		}
		if(con!=null)
		{
			System.out.println("DB Connection success!");
		}
		else
		{
			System.out.println("DB Connection Failed!");
		}
		return con;//return database connection
	}


}