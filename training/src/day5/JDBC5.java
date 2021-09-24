package day5;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import day5.DBconnect;
public class JDBC5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con=DBconnect.mydbconnect();
		Scanner s1=new Scanner(System.in);
		System.out.println("Person No: ");
		int id=s1.nextInt();
		s1.nextLine();
		System.out.println("PersonName:: ");
		String name=s1.nextLine();
		System.out.println("Enter DOB(YYYY-MM-DD):: ");
		String dob1=s1.next();
		System.out.println("Enter DOJ(YYYY-MM-DD):: ");
		String doj1=s1.next();
		
		Date sqdob=Date.valueOf(dob1);
		Date sqdoj=Date.valueOf(doj1);
		String query1="insert into info values(?,?,?,?)";
		PreparedStatement ps1=con.prepareStatement(query1);
		ps1.setInt(1, id);
		ps1.setString(2, name);
		ps1.setDate(3, sqdob);//Date object 
		ps1.setDate(4, sqdoj);
		
		int rows=ps1.executeUpdate();
		System.out.println(rows+ " Record inserted!");
		
		PreparedStatement ps2=con.prepareStatement("select * from info");
		ResultSet rs=ps2.executeQuery();
		System.out.println("Pno\tPname\tDOB\tDOJ");	
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getDate(3) + "\t");
			System.out.println(rs.getDate(4) +"\t");
		}
		rs.close();
		con.close();
		
	}

}
