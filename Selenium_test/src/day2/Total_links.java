package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		List<WebElement> s=drivers.findElements(By.tagName("a"));
		
		System.out.println("Total links "+s.size());
		
		for(int i=0;i<s.size();i++) {
			System.out.println(i+1+" ");
			System.out.println(s.get(i).getAttribute("href"));
		}

	}

}
