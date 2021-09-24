package Activity2;
import java.util.Scanner;


public class Ticket {
	public String[][] Array()
	{
		String[][] s=new String[4][];
		s[0]=new String[4];
		s[1]=new String[2];
		s[2]=new String[3];
		s[3]=new String[1];

		Scanner s1=new Scanner(System.in);
		for(int i=0;i<s.length;i++)//4
		{
			for(int j=0;j<s[i].length;j++)
			{
				
				System.out.println("Enter first name");
				s[j]=s1.next();
				
			}
		}
		return s;
	}
	public void dispArray()
	{
	
	}
	public static void main(String[] args) {
		

	}
	
}
