package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("https://www.magneticautomation.in/2019/01/alert-example.html");
		
		drivers.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
		
		Alert aa=drivers.switchTo().alert();
		System.out.println(aa.getText());
		
		aa.sendKeys("Minal");
		Thread.sleep(1000);
		//aa.accept();
		aa.dismiss();
		
	}

}
