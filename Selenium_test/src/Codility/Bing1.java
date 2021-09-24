package Codility;

import static org.junit.Assert.*;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Bing1 extends WebDriverTestCase{

	@Test
	public void test() throws Exception {

		webDriver.get("https://www.bing.com/");
	  webDriver.findElement(By.name("q")).sendKeys("codility");
	  webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  
	  List<WebElement> ls=webDriver.findElements(By.xpath("//ol[@id='b_results']/li"));
	  assertTrue(ls.size()>=1);
	}

}
