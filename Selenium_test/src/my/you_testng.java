package my;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import day6.Base;

public class you_testng extends Base {
	@Test
	public void f() throws Exception {

		driver.get("https://www.naukri.com/");
		WebElement a=driver.findElement(By.className("btn"));
		
		String c=a.getCssValue("background-color");

		String h= Color.fromString(c).asHex();
		Assert.assertEquals(h,"#ff8703");
		
	}
}
