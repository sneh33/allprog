package day2;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_rediff {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drivers.get("https://www.rediff.com/");
		
		String name=drivers.getTitle();
		System.out.println(name+" Page has loaded");
		//drivers.findElement(By.id("query")).sendKeys("Yes bank");
		//drivers.findElement(By.cssSelector("input[name='query']")).sendKeys("Yes Bank LTD");
		drivers.findElement(By.name("query")).sendKeys("Yes Bank LTD");
		//drivers.findElement(By.cssSelector("input[name='srchquery_tbox']")).sendKeys("Yes Bank LTD");
		//drivers.findElement(By.className("getquoteinput")).sendKeys("Yes Bank LTD");
		drivers.findElement(By.cssSelector("input[value='submit']")).click();
		Thread.sleep(3000);
	}

}
