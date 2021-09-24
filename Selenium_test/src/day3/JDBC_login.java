package day3;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Connection;

public class JDBC_login
{
	public static void main(String[] args) throws Exception
	{
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","Newuser123");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from logininfo");
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		while(rs.next())
		{		
			
			String a=rs.getString(1);
			String b=rs.getString(2);
			
			System.out.println(a+ " "+b);
			
			driver.findElement(By.id("txtUsername")).sendKeys(a);
			driver.findElement(By.name("txtPassword")).sendKeys(b);
			
			driver.findElement(By.id("btnLogin")).click();
			if(driver.getCurrentUrl().contains("dashboard"))
			{
				System.out.println("you are on "+driver.getTitle());
				System.out.println("login successfull");
				driver.findElement(By.id("welcome")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.linkText("Logout")).click();
			}
			else {
				System.out.println("Unsuccessful");
		
			}
		
		}
		rs.close();
		con.close();
		driver.quit();

	}



	}