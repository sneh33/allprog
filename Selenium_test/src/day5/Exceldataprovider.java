package day5;

import org.testng.annotations.Test;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Exceldataprovider {
	WebDriver drivers;
	
  @Test(dataProvider = "dp")
  public void log(String id, String pwd) throws Exception {
	  drivers.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  drivers.findElement(By.id("txtUsername")).sendKeys(id);
		drivers.findElement(By.id("txtPassword")).sendKeys(pwd);
		drivers.findElement(By.id("btnLogin")).click();
		
		drivers.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		drivers.findElement(By.linkText("Logout")).click();
  }

  @BeforeTest
  public void beforeTest() throws Exception{
	  System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		drivers=new ChromeDriver();			
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(3000);
	  drivers.quit();
  }
  
  @DataProvider
  public Object[][] dp()/* throws Exception*/{ //throws exception not needed when handled by try catch block in framework
		/*
		 * wb=new XSSFWorkbook(new
		 * FileInputStream("C:\\Users\\Shree\\Desktop\\LTI training\\Selenium.xlsx"));
		 * XSSFSheet sh=wb.getSheet("Sheet1"); 
		 * Object data[][]=new Object[4][2]; 
		 * for(int i=0;i<4;i++) 
		 * { data[i][0]=sh.getRow(i).getCell(0).toString();
		 * data[i][1]=sh.getRow(i).getCell(1).toString();
		 * 
		 * }
		 */
	  
	  Excel m=new Excel("C:\\\\Users\\\\Shree\\\\Desktop\\\\LTI training\\\\Selenium.xlsx");
	  Object data[][]=new Object[m.getRowNum("Sheet1")][m.getColNum("Sheet1")];
	  
	  for(int i=0;i<data.length;i++) {
		  data[i][0]=m.getData("Sheet1", i, 0);
		  data[i][1]=m.getData("Sheet1", i, 1);
	  }
	  return data;
  }
}
