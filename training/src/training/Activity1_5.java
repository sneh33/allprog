package training;
import java.util.Scanner;

public class Activity1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Salary");
		float sal= s1.nextFloat();
		
		System.out.println("Enter years of service");
		float yos= s1.nextFloat();
		
		if(yos>6)
		{
			float bonus=(float)sal*0.1F;
			System.out.println("Bonus is "+ bonus);
		}
		
		else
		{
			System.out.println("No bonus added");
		}

	}

}
