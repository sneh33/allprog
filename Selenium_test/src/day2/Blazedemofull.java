package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blazedemofull {

	public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
			WebDriver drivers=new ChromeDriver();
			
			drivers.get("https://blazedemo.com/");
			
			WebElement aq= drivers.findElement(By.cssSelector("select[name='fromPort']"));
			Select s1=new Select(aq);
			
			s1.selectByValue("Boston");
			
			WebElement aq2= drivers.findElement(By.cssSelector("select[name='toPort']"));
			Select s2=new Select(aq2);
			s2.selectByIndex(2);
			Thread.sleep(1000);
			
			drivers.findElement(By.cssSelector("input[value='Find Flights']")).click();
			Thread.sleep(1000);
			
			drivers.findElement(By.cssSelector("input[type='submit']")).click();
			Thread.sleep(1000);
			drivers.findElement(By.cssSelector("input#inputName")).sendKeys("Snehal Gajre");
			drivers.findElement(By.cssSelector("input#address")).sendKeys("33 Main street");
			drivers.findElement(By.cssSelector("input#city")).sendKeys("Mumbai");
			drivers.findElement(By.cssSelector("input#state")).sendKeys("Maharashtra");
			drivers.findElement(By.cssSelector("input[name='zipCode']")).sendKeys("134323");
			Thread.sleep(1000);
			WebElement mi= drivers.findElement(By.cssSelector("select[name='cardType']"));
			Select s3=new Select(mi);
			s3.selectByValue("amex");
			Thread.sleep(1000);
			drivers.findElement(By.cssSelector("input#creditCardNumber")).sendKeys("124989432");
			drivers.findElement(By.cssSelector("input#creditCardMonth")).sendKeys("10");
			drivers.findElement(By.cssSelector("input#creditCardYear")).sendKeys("2001");
			drivers.findElement(By.cssSelector("input#nameOnCard")).sendKeys("Snehal");
			Thread.sleep(1000);
			WebElement j=drivers.findElement(By.cssSelector("input[type='checkbox']"));
			
			boolean x=j.isEnabled();
			boolean y=j.isDisplayed();
			boolean z=j.isSelected();
		
			System.out.println("Enabled "+x);
			System.out.println("Display "+y);
			System.out.println("Select "+z);
			
			j.click();
			Thread.sleep(1000);
			
			drivers.findElement(By.cssSelector("input[value='Purchase Flight']")).click();
			
			drivers.quit();

	}

}
