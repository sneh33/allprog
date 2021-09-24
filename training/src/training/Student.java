package training;

class Student_details{
	
	int stud_id;
	String name;
	
	void view() {
		System.out.println("details: "+stud_id+" "+name);
		
	}
	public Student_details(int i,String x)
	{
		System.out.println("first");
		stud_id=i;
		name=x;
	}
	
	public Student_details(int i) {
		System.out.println("Second");
		stud_id=i;
	}
	
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_details s2=new Student_details(1221,"aaa");
		s2.view();
		
		Student_details s9=new Student_details(46643);
		s9.view();
	}

}
