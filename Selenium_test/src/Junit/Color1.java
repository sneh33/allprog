package Junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Color1 {
	static WebDriver drivers;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		drivers=new ChromeDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Thread.sleep(2000);
		drivers.quit();
		
	}

	@Test
	public void test() {
		drivers.get("https://blazedemo.com/");
		WebElement a=drivers.findElement(By.cssSelector("input[value='Find Flights']"));
		
		String backcolor= a.getCssValue("background-color");
		System.out.println(backcolor);
	
		String hexcolor=Color.fromString(backcolor).asHex();
		System.out.println(hexcolor);
		assertEquals("#006dcc",hexcolor);
	}

}
