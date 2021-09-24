package Codility;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

public class Cass extends WebDriverTestCase {

	@Test
	public void test() {
		
		boolean a=webDriver.findElement(By.id("search-input")).isDisplayed();
		assertTrue(a);
		
		webDriver.findElement(By.id("search-input")).sendKeys("castle");
		webDriver.findElement(By.id("search-button")).click();
	

		
	}

}
