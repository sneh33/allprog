package Activity4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class Element1 {

	public static void main(String[] args)throws Throwable
	{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
	

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","Newuser123");
		Scanner s1=new Scanner(System.in);
		System.out.println("Atomic_weight ");
		float a=s1.nextFloat();
		
		System.out.println("Name ");
		String b=s1.nextLine();
		s1.nextLine();
		System.out.println("Chemical_Symbol ");
		String c=s1.nextLine();
	
		String query1="insert into Element values(?,?,?)";
		PreparedStatement ps1=con.prepareStatement(query1);
		ps1.setFloat(1, a); 
		ps1.setString(2, b);
		ps1.setString(3,c);
	
	
		int rows=ps1.executeUpdate();
		System.out.println(rows+ " Record inserted!");
		
		PreparedStatement ps11=con.prepareStatement("select * from Element");

		ResultSet rs=ps11.executeQuery();
		while(rs.next())
		{
			Float a1=rs.getFloat(1);
			String b1=rs.getString(2);
			String c1=rs.getString(3);
			
			System.out.println(a1+ " "+b1 + " "+c1);
		}
		rs.close();
		con.close();





	}

}