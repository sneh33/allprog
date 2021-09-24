package day4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

 /*
  * ORACLE SQL COMMANDS:
  * 
* select name from v$database;
* select * from v$version;

*/

//oracle 18c=>ojbdc8.jar(java archive)

//ojdbc8.jar add to the project

//Right click project->build path->configure build path->libraries tab->add external jars->add the oracle jar file 
//Referenced Libraries folder will be automatically created in eclipse project


//ORACLE TO JAVA
public class JDBC1
{
	public static void main(String[] args)throws Exception 
	{
		//loading the oracle driver
		//drivername is case sensitive
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//DriverManager  is a class
		//Statement,ResultSet,Connection are interfaces
		//1521 is the default port number for ORACLE database

		//XE is the name of the database
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","Newuser123");
		Statement st=con.createStatement();//build sql statements
		ResultSet rs=st.executeQuery("select * from emp");//ResultSet means rows and columns
		while(rs.next())//iterate the records one by one!
		{		
			//EITHER COLUMN NAME OR COLUMN POSITION INDEX 1,2,3....
			int a=rs.getInt("eno");//column name
			String b=rs.getString(2);//2nd column=>name
			float c=rs.getFloat("salary");
			String d=rs.getString("dept");
			System.out.println(a+ " "+b + " "+c + " "+d );
		}
		rs.close();
		con.close();//release DB connection

	}
}