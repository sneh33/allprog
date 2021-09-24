package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CSSlogin {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		drivers.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
		drivers.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
		drivers.findElement(By.cssSelector("input[value='LOGIN']")).click();
		drivers.findElement(By.cssSelector("a.panelTrigger")).click();
		
		Thread.sleep(2000);
		drivers.findElement(By.cssSelector("a[href='/index.php/auth/logout']")).click();
		
	}

}
