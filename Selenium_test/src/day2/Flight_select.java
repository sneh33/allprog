package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flight_select {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("https://blazedemo.com/");
		
		WebElement aq= drivers.findElement(By.cssSelector("select[name='fromPort']"));
		Select s1=new Select(aq);
		
		s1.selectByValue("Boston");
		
		WebElement aq2= drivers.findElement(By.cssSelector("select[name='toPort']"));
		Select s2=new Select(aq2);
		s2.selectByIndex(2);
		Thread.sleep(1000);
		
		drivers.findElement(By.cssSelector("input[value='Find Flights']")).click();
		Thread.sleep(1000);
		
		List<WebElement> ls=drivers.findElements(By.cssSelector("input[value='Choose This Flight']"));
		System.out.println("total button "+ls.size());
		
		ls.get(2).click();

	}

}
