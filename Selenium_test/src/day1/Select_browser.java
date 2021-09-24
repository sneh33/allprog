package day1;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Select_browser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Select a browser");
		System.out.println("Select 1 for chrome browser");
		System.out.println("Select 2 for firefox browser");
		int inp=s1.nextInt();
		
		if (inp==1) {
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
			ChromeDriver drivers=new ChromeDriver();
			
			drivers.get("https://www.selenium.dev/downloads/");
			String name=drivers.getTitle();
			System.out.println(name+" Page has loaded");
			
			Thread.sleep(5000);
			
			drivers.quit();
		}
		
		else if(inp==2) {
			System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
			FirefoxDriver drivers=new FirefoxDriver();
			
			drivers.get("https://www.selenium.dev/downloads/");
			String name=drivers.getTitle();
			System.out.println(name+" Page has loaded");
			
			Thread.sleep(5000);
			
			drivers.quit();
		}
		
		else {
			System.out.println("Wrong number");
		}
		
		

	}

}
