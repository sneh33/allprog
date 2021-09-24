package day3;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception{
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream("C:\\Users\\Shree\\Desktop\\LTI training\\Selenium.xlsx"));
		
		XSSFSheet sh=wb.getSheet("Sheet1");
		/*String data2=sh.getRow(1).getCell(0).toString();
		System.out.print(data2);*/
	
		//int row=sh.getLastRowNum();
	
		for(int i=0;i<=3;i++) {
		String data1=sh.getRow(i).getCell(0).toString();
		System.out.print(data1);
		
		String data=sh.getRow(i).getCell(1).toString();
		System.out.print(" "+data);
		System.out.println();
		}
		

	}

}
