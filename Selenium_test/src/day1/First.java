package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		//ChromeDriver drivers=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
		FirefoxDriver drivers=new FirefoxDriver();
		
		drivers.get("https://www.selenium.dev/downloads/");
		String name=drivers.getTitle();
		System.out.println(name+" Page has loaded");
		
		Thread.sleep(5000);
		
		drivers.quit();

	}

}
