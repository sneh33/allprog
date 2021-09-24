package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Orange_funct {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
				WebDriver drivers=new ChromeDriver();
				
				drivers.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
				String name=drivers.getTitle();
				System.out.println(name+" Page has loaded");
				
				
				drivers.findElement(By.id("txtUsername")).sendKeys("admin");
				drivers.findElement(By.id("txtPassword")).sendKeys("admin123");
				drivers.findElement(By.id("btnLogin")).click();
				

			
				drivers.findElement(By.id("welcome")).click();
				Thread.sleep(2000);
				drivers.findElement(By.linkText("Logout")).click();
			
				
				Thread.sleep(4000);
				
				drivers.quit();

	}

}
