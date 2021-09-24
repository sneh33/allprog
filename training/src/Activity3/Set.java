package Activity3;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Iterator;

/* Write a program that will accept 10 numbers from the user as input and store it in a collection. 
 The numbers should not be duplicated. Also get the index position along with the number where it has to be stored.

*/
public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		LinkedHashSet ob=new LinkedHashSet();
		
		for(int i=0;i<10;i++) {
			int p=s1.nextInt();
			ob.add(p);
		}
		
		//for(int i=0;i<10;i++) {
		//System.out.println("LinkedHashSet(Ordered):: "+ob.[i]+" "+i);	
		
	  //}
		
	}
}
