package training;
import java.util.Scanner;

public class Activity1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("No of eggs");
		int egg= s1.nextInt();
		
		int gross=egg/144;
		int bgross=egg%144;
		 
		int dozen=bgross/12;
		int rem=bgross%12;
		
		System.out.println("Gross "+gross+"Dozen "+dozen+"Remaining "+rem);

	}

}
