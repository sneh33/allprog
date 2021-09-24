package day4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.service.DriverService;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestNG1 {
	WebDriver drivers;
	
  @Test(priority=1, description="result page")
  public void title() {
	  drivers.get("https://www.google.com/");
	  String actualtitle=drivers.getTitle();
	  Assert.assertEquals(actualtitle, "GoogleII");
  }
  
  @Test(priority=2, description="main page")
  public void resulttitle() {
	  drivers.findElement(By.name("q")).sendKeys("LTI");
	  drivers.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  String actualtitle=drivers.getTitle();
	  Assert.assertEquals(actualtitle, "LTI - Google Search");
  }
  
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("Before method");
  }
  
  @AfterMethod
  public void aftermethod(ITestResult resp) throws Exception {
	  System.out.println("After method");
	  if(resp.getStatus()==ITestResult.FAILURE) {
		  TakesScreenshot tc=(TakesScreenshot)drivers;
		  File src=tc.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(src, new File(resp.getName()+".png"));
	  }
	  
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

}
