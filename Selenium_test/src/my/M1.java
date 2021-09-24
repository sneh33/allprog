package my;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class M1 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver s1=new ChromeDriver();
		
		s1.get("https://blazedemo.com/");
		System.out.println(s1.getTitle());
		
		WebElement a=s1.findElement(By.name("fromPort"));
		Select d=new Select(a);
		d.selectByValue("Boston");
		
		WebElement b=s1.findElement(By.name("toPort"));
		Select n=new Select(b);
		n.selectByIndex(4);
		
		s1.findElement(By.cssSelector("input[value='Find Flights']")).click();
		
		List<WebElement> f=s1.findElements(By.cssSelector("input[value='Choose This Flight']"));
		f.get(3).click();
	/*
		List<WebElement> ls=s1.findElements(By.cssSelector("input[value='Choose This Flight']"));
		System.out.println("total button "+ls.size());
		
		ls.get(2).click();}*/

}}
