package USbanks;
import java.io.*;
import java.util.Scanner;


public class Findingdata {
	public static void main (String args[])
	{
		Loading_CSV r=new Loading_CSV();
		System.out.println("1. Display all the complaints based on the year provided by the user");
		System.out.println("2. Display all the complaints based on the name of the bank provided by the user");
		System.out.println("3. Display complaints based on the complaint id provided by the user");
		System.out.println("4. Display number of days took by the Bank to close the complaint");
		System.out.println("5. Display all the complaints closed/closed with explanation");
		System.out.println("6. Take input from user for storing new complaints");
		
		
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		switch (c) {
		case 1:
			System.out.println("enter the year");
			String year=s.next();
			System.out.println(r.compbyyear(year));
			break;
		case 2:
			System.out.println("enter the bank name");
			String bank=s.next();
			System.out.println(r.compbybank(bank));
			break;
		case 3:
			System.out.println("Enter Company ID");
			String id = s.next();
			System.out.println(r.compbyid(id));
			break;
		case 4 :
			System.out.println("Enter date received");
			String date_received=s.next();
			System.out.println("Enter date sent");
			String date_sent=s.next();
			System.out.println(r.daystookbybank(date_received,date_sent));
			break;
		case 5:
			System.out.println("Enter Close or Closed with Explanation");
			String str = s.next();
			System.out.println(r.compbyExp(str));
			break;
		case 7: 
			System.out.println("Enter date received"); 
			String daterec=s.next();
			System.out.println("Enter Product");
			String product=s.next();
			System.out.println("Enter Sub-Product");
			String subproduct=s.next();
			System.out.println("Enter Issue");
			String issue=s.next();
			System.out.println("Enter Sub-Issue");
			String subissue=s.next();
			System.out.println("Enter Company");
			String company=s.next();
			System.out.println("Enter State Initials");
			String state=s.next();
			System.out.println("Enter Zip Code");
			String zip=s.next();
			System.out.println("Enter Submitted Via");
			String submittedv=s.next();
			System.out.println("Enter Company response to consumer");
			String companyrestocust=s.next();
			System.out.println("Enter Timely Respons");
			String timelyresponse=s.next();
			System.out.println("Enter Date Sent to company");
			String datesent=s.next();
			System.out.println("Enter Consumer disputed");
			String consdisputed=s.next();
			System.out.println("Enter Complaint ID");
			String complaintid=s.next();
			//System.out.println(r.com);
		default:
			System.out.println("Incorrect number");
		}
		s.close();	
	}
}
