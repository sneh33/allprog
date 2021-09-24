package day2;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_implicitwait {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		drivers.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drivers.get("https://en-gb.facebook.com/");
		
		drivers.findElement(By.linkText("Create New Account")).click();
		
		drivers.findElement(By.cssSelector("input[value='1']")).click();
		
		List<WebElement> ls=drivers.findElements(By.name("sex"));
		System.out.println("total button "+ls.size());
		
		for(int i=0;i<ls.size();i++) {
			Thread.sleep(1000);
			ls.get(i).click();
		
		}
		
	}

}
