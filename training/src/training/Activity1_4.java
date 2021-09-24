package training;
import java.util.Scanner;

public class Activity1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter name");
		String name= s1.nextLine();
		
		
		System.out.println("Enter roll no");
		String roll_no= s1.nextLine();

        System.out.println("Enter field of interest");
		String foi= s1.nextLine();
		

		System.out.println("Hey, my name is " +name+ "and my roll number is " +roll_no+ ".My field of interest are " +foi);
	}

}
