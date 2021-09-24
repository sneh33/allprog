package day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imageurl {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream("C:\\Users\\Shree\\Desktop\\LTI training\\Selenium.xlsx"));
		
		XSSFSheet sh=wb.getSheet("Sheet2");
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		List<WebElement> s=drivers.findElements(By.tagName("img"));
			
		for(int i=0;i<s.size();i++) {
			System.out.println(i+1+" ");
			System.out.println(s.get(i).getAttribute("src")); 
			sh.createRow(i).createCell(0).setCellValue(s.get(i).getAttribute("src"));
		}
	
		wb.write(new FileOutputStream("C:\\Users\\Shree\\Desktop\\LTI training\\Seleniumnew.xlsx"));

}}