package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Click_tab {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("https://www.selenium.dev/");
		String name=drivers.getTitle();
		System.out.println(name+" Page has loaded");
		
		drivers.findElement(By.linkText("Downloads")).click();
		String name2=drivers.getTitle();
		System.out.println(name2+" Downloads page has loaded");
		
		Thread.sleep(5000);
		
		drivers.quit();

	}

}
