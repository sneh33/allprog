package day5_pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPage {
	
	@FindBy(name="securityAuthentication[userName]")WebElement e_username;
	@FindBy(id="btnSearchValues")WebElement e_reset;
	@FindBy(id="btnCancel")WebElement e_cancel;
	
	
	public void do_reset(String username) {
		e_username.sendKeys(username);  
		e_reset.click();
		
	}

	public void do_cancel() {
		e_cancel.click();
	}
}
