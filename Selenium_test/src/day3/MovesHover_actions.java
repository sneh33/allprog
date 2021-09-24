package day3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class MovesHover_actions {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		drivers.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
		drivers.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
		drivers.findElement(By.cssSelector("input[value='LOGIN']")).click();
		
		Actions ac=new Actions(drivers);
		WebElement qen=drivers.findElement(By.linkText("Performance"));
		ac.moveToElement(qen).perform();
		WebElement qen1=drivers.findElement(By.linkText("My Trackers"));
		ac.click(qen1).perform();
		
		TakesScreenshot tc=(TakesScreenshot)drivers;
		File src=tc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("Screenshot.png"));
		
		

	}

}
