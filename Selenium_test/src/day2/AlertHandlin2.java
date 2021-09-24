package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlin2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.get("https://www.easemytrip.com/");
		
		drivers.findElement(By.id("FromSector_show")).click();
		drivers.findElement(By.id("airport3")).click();
		drivers.findElement(By.cssSelector("input[onclick='SearchFlightWithArmy();']")).click();
		
		
		Alert a=drivers.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		

	}

}
