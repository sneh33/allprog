package day6;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Keywords {
	WebDriver driver;
	
	public Keywords(WebDriver driver) {
		this.driver=driver;
	}
	
	public void getURL(String url) {
		driver.get(url);
	}
	/*
	public void click(String locatorType, String locatorValue) {
		if(locatorType.equals("id")) {
			driver.findElement(By.id(locatorValue)).click();
		}
		else if(locatorType.equals("name")) {
			driver.findElement(By.name(locatorValue)).click();
		}
		else if(locatorType.equals("link")) {
			driver.findElement(By.linkText(locatorValue)).click();
		}
		else if(locatorType.equals("css")) {
			driver.findElement(By.cssSelector(locatorValue)).click();
		}
		else if(locatorType.equals("xpath")) {
			driver.findElement(By.xpath(locatorValue)).click();
		}
		else {
			System.out.println("Invalid locator");
		}
		
	}
	
	public void sendkeys(String locatorType, String locatorValue, String keyvalue) {
		if(locatorType.equals("id")) {
			driver.findElement(By.id(locatorValue)).sendKeys(keyvalue);
		}
		else if(locatorType.equals("name")) {
			driver.findElement(By.name(locatorValue)).sendKeys(keyvalue);
		}
		else if(locatorType.equals("link")) {
			driver.findElement(By.linkText(locatorValue)).sendKeys(keyvalue);
		}
		else if(locatorType.equals("css")) {
			driver.findElement(By.cssSelector(locatorValue)).sendKeys(keyvalue);
		}
		else if(locatorType.equals("xpath")) {
			driver.findElement(By.xpath(locatorValue)).sendKeys(keyvalue);
		}
		else {
			System.out.println("Invalid locator");
		}
		
	}*/
	public void click(String locatorType, String locatorValue) {
		getElement(locatorType,locatorValue).click();
		
	}
	
	public void type(String locatorType, String locatorValue, String keyvalue) {
		getElement(locatorType,locatorValue).sendKeys(keyvalue);
		
	}
	
	public void dropdown(String locatorType, String locatorValue, String data) {
		Select s1=new Select(getElement(locatorType,locatorValue));
		s1.selectByVisibleText(data);
	}
	
	public void snap(String path) {
		TakesScreenshot tc=(TakesScreenshot)driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File(path));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public WebElement getElement(String locatorType, String locatorValue) {
		WebElement E=null;
		if(locatorType.equals("id")) {
			E=driver.findElement(By.id(locatorValue));	
		}
		else if(locatorType.equals("name")) {
			E=driver.findElement(By.name(locatorValue));
		}
		else if(locatorType.equals("link")) {
			E=driver.findElement(By.linkText(locatorValue));
		}
		else if(locatorType.equals("css")) {
			E=driver.findElement(By.cssSelector(locatorValue));
		}
		else if(locatorType.equals("xpath")) {
			E=driver.findElement(By.xpath(locatorValue));
		}
		else {
			System.out.println("Invalid locator");
		}
		return E;
		
	}
	
	

}
