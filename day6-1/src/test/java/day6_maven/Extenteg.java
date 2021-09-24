package day6_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extenteg {
	WebDriver driver;
  @Test
  public void f() {
	  ExtentReports ex=new ExtentReports();
	  ex.attachReporter(new ExtentHtmlReporter("bing.html"));
	  
	  ExtentTest tc=ex.createTest("SearchTest");
	  tc.info("Opening url");
	  driver.get("https://www.bing.com/");
	  tc.info("typing search keyword");
	  driver.findElement(By.name("q")).sendKeys("lti");
	  tc.info("press enter");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  tc.info("verifying title");
	  Assert.assertTrue(driver.getTitle().contains("lti"));
	  tc.pass("Test pass");
	  ex.flush();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(3000);
	  driver.quit();
  }
}
