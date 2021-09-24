package USbank;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
class Complaintdetails {

	String dateReceived;
	String product;
	String subProduct;
	String issue;
	String subIssue;
	String company;
	String state;
	String ZIPcode;
	String submittedVia;
	String dateSentToCompany;
	String companyResponseToConsumer;
	String timelyResponse;
	String consumerDisputed;
	String complaintid;
	


}


public class Loadingfile {
	HashMap <String, Complaintdetails> newobj = new HashMap<>();
	public void fileLoader() {

	
	 String path="D:\\complaints.csv";
	 String line="";
	 
	 try {
		BufferedReader bf=new BufferedReader(new FileReader(path));
		while ((line=bf.readLine())!=null)
		{   
			
			String[] elements=line.split(",");
			Complaintdetails objcompdet=new Complaintdetails();
			objcompdet.dateReceived=elements[0];
			objcompdet.product=elements[1];
			objcompdet.subProduct=elements[2];
			objcompdet.issue=elements[3];
			objcompdet.subIssue=elements[4];
			objcompdet.company=elements[5];
			objcompdet.state=elements[6];
			objcompdet.ZIPcode=elements[7];
			objcompdet.submittedVia=elements[8];
			objcompdet.dateSentToCompany=elements[9];
			objcompdet.companyResponseToConsumer=elements[10];
			objcompdet.timelyResponse=elements[11];
			objcompdet.consumerDisputed=elements[12];
			objcompdet.complaintid=elements[13];
			
			newobj.put(elements[13],objcompdet); 
		
		}
		bf.close();
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	 
	 
	}

	HashMap<String,Complaintdetails> newobj(){
		
		return newobj;
		
	}

}
