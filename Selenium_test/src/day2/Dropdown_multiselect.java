package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_multiselect {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();

		drivers.get("http://www.magneticautomation.in/p/dropdown.html");
		Select sc=new Select(drivers.findElement(By.name("multi")));
		
		
		sc.selectByIndex(3);
		
		Thread.sleep(2000);
		sc.selectByValue("1");
		
		Thread.sleep(2000);
		sc.selectByVisibleText("Two");
		Thread.sleep(2000);
		
		sc.deselectByValue("4");
		Thread.sleep(2000);
		sc.deselectAll();
		
		drivers.quit();

	}

}
