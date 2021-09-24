package training;
import java.util.Scanner;

class Course{
	int id;
	String name;
	Float fees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getFees() {
		return fees;
	}
	public void setFees(Float fees) {
		this.fees = fees;
	}
	
}

public class next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course pr1[]= new Course[3];
		Scanner s1= new Scanner(System.in);
		
		for (int i=0; i<pr1.length;i++)
		{
			System.out.println("Courseno"+(i+1)+":");
			int a=s1.nextInt();
			s1.nextLine();
			System.out.println("Course name"+(i+1)+":");
			String b=s1.nextLine();
			System.out.println("Fees"+(i+1)+":");
			float c=s1.nextFloat();
			
			pr1[i]= new Course();
			pr1[i].setId(a);
			pr1[i].setName(b);
			pr1[i].setFees(c);
		
		}
		
		for(int i=0;i<pr1.length;i++) {
			System.out.println("id "+pr1[i].getId()+"name " +pr1[i].getName()+"fees "+pr1[i].getFees());
		}
		

	}

}
