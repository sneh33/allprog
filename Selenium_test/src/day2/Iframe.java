package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("file:///C:/Users/Shree/Desktop/LTI%20training/Iframe1.html");
		
		drivers.switchTo().frame("front");
		drivers.findElement(By.name("user_name_entry_field")).clear();
		drivers.switchTo().defaultContent();
		
		drivers.switchTo().frame(1);
		drivers.findElement(By.id("sb_form_q")).sendKeys("Hello");
		drivers.switchTo().defaultContent();
		
		WebElement a1=drivers.findElement(By.className("dummy"));
		drivers.switchTo().frame(a1);
		drivers.findElement(By.cssSelector("button[aria-label='Search']")).click();

	}

}
