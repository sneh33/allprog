package day5;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JDBC4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","Newuser123");

		PreparedStatement ps1=con.prepareStatement("select * from emp");
		ResultSet rs=ps1.executeQuery();
		
		ResultSetMetaData rsobj=rs.getMetaData();
		int col=rsobj.getColumnCount();
		System.out.println("Total Columns: "+rsobj.getColumnCount());
		System.out.println("Column name:: "+rsobj.getColumnName(2));
		System.out.println("Column Type:: "+rsobj.getColumnTypeName(1));
	
		DatabaseMetaData db=con.getMetaData();
		System.out.println("Driver Name: "+db.getDriverName()); 
		System.out.println("Version: "+db.getDriverVersion()); 
		System.out.println("DB product Name: "+db.getDatabaseProductName()); 
		System.out.println("User Name: "+db.getUserName()); 
		System.out.println("DB product Version: "+db.getDatabaseProductVersion()); 
	
	
	
	
	}

}
