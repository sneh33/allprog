package Activity2;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[10];
		 Scanner s1=new Scanner(System.in);
	
		 for(int i=0;i<a.length;i++)
			{
				a[i]=s1.nextInt();
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+ " ");
			}

	}

}
