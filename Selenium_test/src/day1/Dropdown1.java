package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown1 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("https://blazedemo.com/");
		
		WebElement aq=drivers.findElement(By.name("fromPort"));
		Select s1=new Select(aq);
		
		s1.selectByIndex(6);
		
		Thread.sleep(2000);
		s1.selectByValue("San Diego");
		Thread.sleep(2000);

		s1.selectByVisibleText("Philadelphia");
		Thread.sleep(4000);
		
		drivers.quit();

	}

}
