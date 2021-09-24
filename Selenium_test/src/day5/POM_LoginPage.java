package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_LoginPage {
	WebDriver driver;
	public POM_LoginPage(WebDriver driver){
		this.driver=driver;
	}

	By e_username=By.name("txtUsername");
	By e_pwd=By.name("txtPassword");
	By e_login=By.id("btnLogin");
	By e_forget=By.linkText("Forgot your password?");
	
	
	public void setusername(String user) {
		driver.findElement(e_username).sendKeys(user);
	}
	
	public void setpwd(String pwd) {
		driver.findElement(e_pwd).sendKeys(pwd);
	}
	
	public void clicklogin() {
		driver.findElement(e_login).click();
	}
	
	public void dologin(String user,String pwd) {
		setusername(user);
		setpwd(pwd);
		clicklogin();
		
	}
	
	public void clickForget() {
		driver.findElement(e_forget).click();
	}
	
	
	
}
