package training;
import java.util.Scanner;
public class Activity1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1=new Scanner(System.in);
		System.out.println("No of classes held");
		int held= s1.nextInt();
		
		System.out.println("No of classes attended");
		int attend= s1.nextInt();
		

		float total=((float)attend/(float)held)*100;
		
		System.out.println("Percentage of classes attended" +total);
		if (total>70)
		{
			System.out.println("Allowed to sit in exam");
		}
		else 
		{
			System.out.println("Do you have medical cause: Enter Yes or No");
			String med= s1.next();
			
			System.out.println(med);
			if (med== "Yes")
				
				{
					System.out.println("Allowed to sit in exam");
				}
			else
				{
					System.out.println("Not allowed to sit in exam");
				}
		}
}
}
