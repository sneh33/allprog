package day5_pagefactory;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class pagefact_runner {
	WebDriver driver;
  @Test
  public void forgettest() {
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
	  lp.clickForget();
	  Assert.assertEquals(driver.getCurrentUrl().contains("requestPasswordResetCode"),true);
   
  }
  
  @Test
  public void logintest() {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   //implicitwait
	  //WebDriverWait wt=new WebDriverWait(driver,20);					//explicitwait
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
	  lp.dologin("admin", "admin123");
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	  driver.findElement(By.id("welcome")).click();
	  
	  //wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
	  driver.findElement(By.linkText("Logout")).click();
   
  }
  
  @BeforeTest
  @Parameters("browser")
  public void beforeTest(String browser) {
	  if(browser.equals("chrome")) {
	  System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		driver=new ChromeDriver();
	  }
	  else if(browser.equals("firefox")) {
		  System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		  }
  }
  

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(3000);
	  driver.quit();
  }
}
