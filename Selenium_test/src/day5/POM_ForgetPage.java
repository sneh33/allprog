package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_ForgetPage {  //constructor
	WebDriver driver;
	public POM_ForgetPage(WebDriver driver){  //driver will be given by user who creates object
		this.driver=driver;
	}
	
	
	By e_username=By.name("securityAuthentication[userName]");
	By e_reset=By.id("btnSearchValues");
	By e_cancel=By.id("btnCancel");
	
	public void do_reset(String username) {
		driver.findElement(e_username).sendKeys(username);  //can use normal mtd also
		driver.findElement(e_reset).click();
		
	}

	public void do_cancel() {
		driver.findElement(e_cancel).click();
	}
}
