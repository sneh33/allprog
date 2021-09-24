package day6_maven;

import java.io.FileReader;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CSvfile {
  @Test
  public void f() throws Exception{
	  CSVReader cs=new CSVReader(new FileReader("C:\\Users\\Shree\\Desktop\\LTI training\\data1.csv"));
	  
	  List<String[]> a=cs.readAll();
	  
	  for(int i=0;i<a.size();i++) {
		  String[] row=a.get(i);			//gives data that row
		  System.out.print(row[0]+" ");
		  System.out.println(row[1]);
	  }
	  }
}
