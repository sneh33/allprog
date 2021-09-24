package day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCsel {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","Newuser123");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from logininfo");
		
		while(rs.next())
		{		
			
			String a=rs.getString(1);
			String b=rs.getString(2);
			System.out.println(a+" "+b);
			
		}
		
		
	}

}
