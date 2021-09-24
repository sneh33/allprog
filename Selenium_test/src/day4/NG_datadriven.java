package day4;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class NG_datadriven {
	WebDriver drivers;
  @Test(dataProvider = "dp")
  public void logindetails(String id, String pwd) throws Exception {
	  drivers.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  drivers.findElement(By.id("txtUsername")).sendKeys(id);
		drivers.findElement(By.id("txtPassword")).sendKeys(pwd);
		drivers.findElement(By.id("btnLogin")).click();
		

	
		drivers.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		drivers.findElement(By.linkText("Logout")).click();
	
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		drivers=new ChromeDriver();
		
		
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(3000);
	  drivers.quit();
  }
  @DataProvider
  public Object[][] dp() {
	  
	  Object data[][]=new Object[4][2];
	  data[0][0]="admin";
	  data[0][1]="admin123";
	  data[1][0]="hr";
	  data[1][1]="hr123";
	  data[2][0]="demo";
	  data[2][1]="demo123";
	  data[3][0]="helo";
	  data[3][1]="helo123";
	  return data;
   
  }
}
