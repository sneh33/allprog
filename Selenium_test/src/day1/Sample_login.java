package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_login {

	public static void main(String[] args) throws Exception{
	
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("http://demo.frontaccounting.eu/index.php");
		String name=drivers.getTitle();
		System.out.println(name+" Page has loaded");
		
		
		drivers.findElement(By.name("user_name_entry_field")).sendKeys("demouser");
		drivers.findElement(By.name("password")).clear();
		drivers.findElement(By.name("password")).sendKeys("password");
		
		drivers.findElement(By.name("SubmitUser")).click();
		Thread.sleep(2000);
		drivers.findElement(By.linkText("Logout")).click();
		
		
		Thread.sleep(4000);
		
		drivers.quit();

	}

}
