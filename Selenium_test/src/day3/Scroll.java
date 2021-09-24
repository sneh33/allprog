package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("https://www.selenium.dev/");
		
		JavascriptExecutor js=(JavascriptExecutor)drivers;
		WebElement jj=drivers.findElement(By.linkText("@diegofmolina"));
		
		js.executeScript("arguments[0].scrollIntoView();", jj);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)", jj);
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)", jj);
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
