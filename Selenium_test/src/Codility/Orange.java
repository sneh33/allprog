package Codility;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

public class Orange extends WebDriverTestCase{

	@Test
	public void test() {
	
		webDriver.get("https://opensource-demo.orangehrmlive.com/");
		
		webDriver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		String a=webDriver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		
		assertEquals("Username cannot be empty",a);
		
		
	}
	@Test
	public void test2() {
		webDriver.findElement(By.name("txtUsername")).sendKeys("admin");
		webDriver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		String b=webDriver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		
		assertEquals("Password cannot be empty",b);
		
	}
	@Test
	public void test3() {
		webDriver.findElement(By.name("txtUsername")).sendKeys("atet");
		webDriver.findElement(By.name("txtPassword")).sendKeys("13");
		webDriver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		String c=webDriver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		
		assertEquals("Invalid credentials",c);
		
	}

}
