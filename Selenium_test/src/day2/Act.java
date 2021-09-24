package day2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize(); // MAXIMIZE the Window

        
        driver.get("https://www.rediff.com");
        String mid = driver.getWindowHandle();
        System.out.println("Parent id is : " + mid);

        driver.switchTo().frame("moneyiframe");
        driver.findElement(By.name("query")).sendKeys("Yes Bank LTD");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type = 'submit']")).click();
        Thread.sleep(1000);
        
        Set<String> allWin = driver.getWindowHandles();
       
        for(String id : allWin) 
        {
        	System.out.println(id);
        	if(!id.equals(mid)) 
        	{
        		driver.switchTo().window(id);
        		System.out.println("Title of New Tab is : " + driver.getTitle());
                Thread.sleep(2000); 
                driver.close();
        	}
        	
        }
        
        Thread.sleep(2000);
        driver.quit();
	}

}
