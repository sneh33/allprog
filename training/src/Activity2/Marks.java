package Activity2;
import java.util.Scanner;
/* Write a program that prompts user for the mark (between 0-100 in int) of 3 students; computes the average (in double); and prints the result rounded to 2 decimal places. Your program needs to perform input validation. For examples,

Enter the mark (0-100) for student 1: 56
Enter the mark (0-100) for student 2: 101
Invalid input, try again...
Enter the mark (0-100) for student 2: -1
Invalid input, try again...
Enter the mark (0-100) for student 2: 99
Enter the mark (0-100) for student 3: 45
The average is: 66.67*/

}
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the mark (0-100) for student 1: ");
		int mark=s1.nextInt();
		if (mark>100)
		{System.out.println("Invalid input, try again...");}
		
		
		System.out.println("Enter the mark (0-100) for student 2: ");
		int mark2=s1.nextInt();
		if (mark2>100)
		{System.out.println("Invalid input, try again...");}
		
		System.out.println("Enter the mark (0-100) for student 3: ");
		int mark3=s1.nextInt();
		if (mark3>100)
		{System.out.println("Invalid input, try again...");}
		
		
		System.out.println("The average is: "+(mark+mark2+mark3)/3);
		

	}

}
