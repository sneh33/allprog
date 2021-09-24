package day6;

import org.testng.annotations.Test;

import day5.Excel;

import org.testng.annotations.DataProvider;

public class Key_runner extends Base{
  @Test(dataProvider = "dp")
  public void details(String key, String locatorType, String locatorValue,String data) {
	  Keywords k=new Keywords(driver);
	  if(key.equals("getURL"))
		  k.getURL(data);
	  else if(key.equals("click"))
		  k.click(locatorType, locatorValue);
	  else if(key.equals("type"))
		  k.type(locatorType, locatorValue,data);
	  else if(key.equals("selectFromDropDown"))
		  k.dropdown(locatorType, locatorValue,data);
	  else if(key.equals("getSnap"))
		  k.snap(data);
	  else
		  System.out.println("Invalid");

	  
  }

  @DataProvider
  public Object[][] dp() {
	  Excel m=new Excel("C:\\Users\\Shree\\Downloads\\Book1.xlsx");
	  Object data[][]=new Object[m.getRowNum("Sheet5")-1][m.getColNum("Sheet5")];
	  
	  for(int i=0;i<data.length;i++) {
		  data[i][0]=m.getData("Sheet5", i+1, 0);
		  data[i][1]=m.getData("Sheet5", i+1, 1);
		  data[i][2]=m.getData("Sheet5", i+1, 2);
		  data[i][3]=m.getData("Sheet5", i+1, 3);
	  }
	  return data;
    
  }
}
