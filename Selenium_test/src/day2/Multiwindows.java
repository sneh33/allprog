package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiwindows{

	public static void main(String[] args)  throws Exception {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver drivers=new ChromeDriver();
		
		drivers.get("https://www.naukri.com/");
		
		String s=drivers.getWindowHandle();
		System.out.println(s);
		
		Set<String> alwin=drivers.getWindowHandles();
		/*
		for(String i:alwin) {
			System.out.println(i);
			
			if(!i.equals(s)) {
				drivers.switchTo().window(i);
				System.out.println(drivers.getTitle());
				Thread.sleep(1000);
				drivers.close();
			}
		}*/
		
		List<String> alwin2=new ArrayList<>(alwin);
		drivers.switchTo().window(alwin2.get(1));
		 for(int j=0;j<alwin2.size();j++) {
			 String i=alwin2.get(j);

			 if(!i.equals(s)) {
					drivers.switchTo().window(i);
					System.out.println(drivers.getTitle());
					Thread.sleep(1000);
					drivers.close();
		 }
		 }
		
		drivers.quit();

	
	}
}
