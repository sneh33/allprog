package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions_keyboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("https://www.bing.com/");
		WebElement sr=drivers.findElement(By.name("q"));
		Actions ac= new Actions(drivers);
		
		//ac.keyDown(Keys.SHIFT).sendKeys(sr,"hello").doubleClick(sr)
		//.contextClick(sr).perform();
		
		Action oth= ac.keyDown(Keys.SHIFT).sendKeys(sr,"hello").doubleClick(sr)
		.contextClick(sr).build();
		
		oth.perform();
	}

}
