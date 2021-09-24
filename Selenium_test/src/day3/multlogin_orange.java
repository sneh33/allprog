package day3;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class multlogin_orange {

	public static void main(String[] args) throws Exception{
	
		
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream("C:\\Users\\Shree\\Desktop\\LTI training\\Selenium.xlsx"));
		
		XSSFSheet sh=wb.getSheet("Sheet1");
	
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		drivers.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		for(int i=0;i<=3;i++) {
		String data1=sh.getRow(i).getCell(0).toString();
		System.out.print(data1);
		
		String data=sh.getRow(i).getCell(1).toString();
		System.out.print(data);
		drivers.findElement(By.id("txtUsername")).sendKeys(data1);
		drivers.findElement(By.id("txtPassword")).sendKeys(data);
		drivers.findElement(By.id("btnLogin")).click();
		
		
		if(drivers.getCurrentUrl().contains("dashboard")) {
			drivers.findElement(By.id("welcome")).click();
			Thread.sleep(2000);
			drivers.findElement(By.linkText("Logout")).click();
			System.out.println("successful");
		}
		else {
			System.out.println("Unsuccessful");
		}
		
	
	
		}
}
}
