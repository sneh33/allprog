package training;
import java.util.Scanner;

class Nameformat extends Throwable{
	public String toString() {
		return "Incorrect format";
	}
}

class AgeRange extends Throwable{
	public String toString() {
		return"Incorrect range";
	}
}

class Details{
	int id;
	String name;
	int age;
	
	Details(int a,String b,int c){
		id=a;
		name=b;
		age=c;
		
		int temp=0;
		int l=b.length();
		
		for(int i=0;i<l;i++){
			
			char cp;
			cp=b.charAt(i);
			if(cp<'A'||cp>'Z'&&cp<'a'||cp>'z') {
				temp=temp+1;
				
			}
			
		}
		try {
			if(temp==1) {
				throw new Nameformat();
			}
		}
		catch(Nameformat e) {
			System.out.println("catch block "+e);
		}
		
		finally {
			System.out.println("Finally block");
		}
		
	}
	
	void disp() {
		System.out.println("id "+id+"name "+name+"salary"+age);
	}
	
	
}

public class mult_exception {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
	
		System.out.println("id: ");
		int y=s1.nextInt();
		System.out.println("Name: ");
		String x=s1.next();
		System.out.println("Age: ");
		int z=s1.nextInt();
		
		Details d1 =new Details(y,x,z);
		//d1.disp(11,"ssgh",32);
		System.out.println("id "+d1.id+"name "+d1.name+"salary"+d1.age);

	}

}
