package day6;

import org.testng.annotations.Test;

public class Runner_keyword extends Base {				//before test taken from base class
  @Test
  public void run() {
	  Keywords kn=new Keywords(driver);
	
		
		  kn.getURL("https://www.facebook.com/"); 
		  kn.type("name","email","6786787687"); 
		  kn.click("name", "login"); 
		  kn.snap("fb.png");
		  kn.getURL("https://blazedemo.com/");
		  kn.dropdown("name", "fromPort", "Boston");
		  
		 
  }
}
