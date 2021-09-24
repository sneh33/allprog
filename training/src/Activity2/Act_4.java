package Activity2;

class Employee{
	String f_name;
	String l_name;
	double salary;
	
	Employee(String a,String b,double c){
		System.out.println("in const");
		f_name=a;
		l_name=b;
		salary=c;
		
		if (c<0.0) {
			salary=0.0;
		}
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}


public class Act_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee o1= new Employee("Mina","Kapoor",2000);
		Employee o2= new Employee("Teena","Jain",8000);
		
		System.out.println("salary"+o1.getSalary()+" "+o2.getSalary());
		
		o1.setSalary((o1.getSalary())+0.1*(o1.getSalary()));
		o2.setSalary((o2.getSalary())+0.1*(o2.getSalary()));
		
		System.out.println("INC salary"+o1.getSalary()+" "+o2.getSalary());

	}

}
