package day1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Select_browser1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Select a browser");
		System.out.println("Select 1 for chrome browser");
		System.out.println("Select 2 for firefox browser");
		int inp=s1.nextInt();
		
		WebDriver drivers=null;
		
		if (inp==1) {
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
			drivers=new ChromeDriver();
			
			
		}
		
		else if(inp==2) {
			System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
			drivers=new FirefoxDriver();
			
			
		}
		
		else {
			System.out.println("Wrong number");
		}
		
		if(drivers!=null) {
		drivers.get("https://www.selenium.dev/downloads/");
		String name=drivers.getTitle();
		System.out.println(name+" Page has loaded");
		
		Thread.sleep(5000);
		
		drivers.quit();
		}

	}

}
