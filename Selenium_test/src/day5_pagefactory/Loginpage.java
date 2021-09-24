package day5_pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	@FindBy(name="txtUsername")WebElement e_user;
	@FindBy(name="txtPassword")WebElement e_pwd;
	@FindBy(id="btnLogin")WebElement e_login;
	@FindBy(linkText="Forgot your password?")WebElement e_forget;


	public void setusername(String user) {
		e_user.sendKeys(user);
	}
	
	public void setpwd(String pwd) {
		e_pwd.sendKeys(pwd);
	}
	
	public void clicklogin() {
		e_login.click();
	}
	
	public void dologin(String user,String pwd) {
		setusername(user);
		setpwd(pwd);
		clicklogin();
		
	}
	
	public void clickForget() {
		e_forget.click();
	}


}
