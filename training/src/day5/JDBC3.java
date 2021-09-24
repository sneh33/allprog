package day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC3
{

	public static void main(String[] args) throws Exception
	{
	
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","Newuser123");
		Scanner s1=new Scanner(System.in);
		System.out.println("Eno: ");
		int a=s1.nextInt();
	
		
		String query1="delete from emp salary where eno=?";
		PreparedStatement ps1=con.prepareStatement(query1);

		
		ps1.setInt(1, a); 
	
		
		int rows=ps1.executeUpdate();
		if(rows>=1)
		{
			System.out.println("Record Exist!");
			System.out.println(rows+ " Record Updated!");
		}
		else
		{
			System.out.println("Record Not Exist!");
		System.out.println(rows+ " Record Updated!");			
		}		

		PreparedStatement ps11=con.prepareStatement("select * from emp");
		
		ResultSet rs=ps11.executeQuery();
		while(rs.next())
		{
			int a1=rs.getInt("eno");
			String b1=rs.getString(2);
			float c1=rs.getFloat("salary");
			String d1=rs.getString(4);
			System.out.println(a1+ " "+b1 + " "+c1+ " "+d1);
		}
		rs.close();
		con.close();


	}

}