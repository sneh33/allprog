package day5;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM_runner {
	WebDriver driver;
  @Test(description="Forget link check")
  public void forgettest() {
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  POM_LoginPage lp=new POM_LoginPage(driver);           //obj created
	  lp.clickForget();
	  Assert.assertTrue(driver.getCurrentUrl().contains("requestPasswordResetCode"));
  }
  
  @Test(dependsOnMethods="forgettest",description="Cancel button check")
  public void canceltest() {
	  //driver.manage().deleteAllCookies();
	  POM_ForgetPage ll=new POM_ForgetPage(driver);          
	  ll.do_cancel();
	  Assert.assertTrue(driver.getCurrentUrl().contains("auth/login"));
  }
  
  @Test(dependsOnMethods="canceltest",description="Login check")
  public void logintest() {
	  POM_LoginPage p=new POM_LoginPage(driver);        
	  p.dologin("admin","admin123");
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
  }
  
   
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		driver=new ChromeDriver();
			
  }
  

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(3000);
	  driver.quit();
  }
}
