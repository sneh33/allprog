package Junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_junit {
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
		drivers.get("https://www.rediff.com/");
		String act=drivers.getTitle();
		assertEquals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping",act);
	}

}
