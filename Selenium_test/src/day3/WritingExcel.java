package day3;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream("C:\\Users\\Shree\\Desktop\\LTI training\\Selenium.xlsx"));
		
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		sh.getRow(1).getCell(1).setCellValue("pincode");
		
		sh.getRow(1).createCell(2).setCellValue("hello");
		
		sh.createRow(4).createCell(3).setCellValue("World");
		
		wb.write(new FileOutputStream("C:\\Users\\Shree\\Desktop\\LTI training\\Seleniumnew.xlsx"));
	}

}
