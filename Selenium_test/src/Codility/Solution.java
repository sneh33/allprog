package Codility;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Solution  extends WebDriverTestCase {

	@Test
	public void test() {
		webDriver.get("https://jmeter.apache.org/");
		webDriver.get("https://www.bing.com/");
		List<WebElement> ls=webDriver.findElements(By.xpath("//div[@class='nav']/ul[3]/li/ul/li/a"));
		//List<WebElement> ls=webDriver.findElements(By.xpath("//li"));
		assertEquals(10,ls.size());
		assertEquals(true,ls.size()>1);
		assertTrue(ls.size()>1);
	}

}
