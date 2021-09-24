package training;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		int a[]= new int[5];
		
		String dept[]= {"HR","management","consulting"};
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter");
		
		for (int i=0; i<a.length; i++) {
			
			a[i]= s1.nextInt();
			
		}
		for (int i=0; i<a.length; i++) {
			
			System.out.print(a[i]+" ");
			
		}
		for (String p:dept) {
			System.out.print(p+" ");
			
		}
		
		//a[0]=31;
		//a[4]=32;
		//System.out.println(a[0]+" "+a[2]);

	}

}
