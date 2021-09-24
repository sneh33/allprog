package Activity3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Act_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		try {
            System.out.println("Enter Integer Value: ");
            int inp = s1.nextInt(); // input : "1.1"  
            System.out.println(inp);
         } 
		catch (InputMismatchException e) {
            System.out.println("Invalid input "+ e);
         }
		finally {
			System.out.println("Finally executed ");
		}

	}

}
