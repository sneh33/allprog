package day6;

import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Linktesting {
	WebDriver driver;
	Properties prop;
  @Test
  public void linktest() throws Exception{
	  driver.get(prop.getProperty("url"));
	  
	  List<WebElement> links=driver.findElements(By.tagName("a"));
	  
	  for(int i=0;i<links.size();i++) {
		  String href=links.get(i).getAttribute("href");
		  
		  URL url=new URL(href);      
		  
		  URLConnection con=url.openConnection();   //opens channel for connection
		  //con.connect();  --not used because doesn't have response code or status code mtd
		  HttpURLConnection httpcon=(HttpURLConnection)con;   //typecasting
		  
		  httpcon.connect();    //connection
		  
		  int code=httpcon.getResponseCode();
		  
		  if(code==200) {						//200- successful 
			  System.out.println(url+" Successful "+code);
		  }
		  else {
			  System.out.println(url+" unsucessful "+code);
		  }
	  }
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() throws Exception{
	  System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	  ChromeOptions op=new ChromeOptions();
	  op.addArguments("--headless"); 	//headless-browser starts but won't be displayed
		driver=new ChromeDriver(op);
		prop=new Properties();
		prop.load(new FileInputStream("settings.property"));

		
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(3000);
	  driver.quit();
  }

}
