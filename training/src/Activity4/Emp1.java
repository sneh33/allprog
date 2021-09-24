package Activity4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Employee{
	int id;
	String name;
	float sal;
	public Employee(int id, String name, float sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}

public class Emp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee ob=new Employee(11,"Ramesh",13133.23f);
		Employee ob1=new Employee(12,"Minal",143533.89f);
		Employee ob2=new Employee(23,"jia",46133.78f);
		Employee ob3=new Employee(42,"kuhu",67573.454f);
		Employee ob4=new Employee(56,"karan",14733.231f);
		Employee ob5=new Employee(15,"suresh",89733.78f);
		Employee ob6=new Employee(65,"pinky",23463.276f);
		Employee ob7=new Employee(18,"bunty",36323.56f);
		Employee ob8=new Employee(11,"tania",6598.15f);
		Employee ob9=new Employee(36,"mansi",19823.789f);
		
		ArrayList<Employee> s1=new ArrayList<>();
		s1.add(ob);
		s1.add(ob1);
		s1.add(ob2);
		s1.add(ob3);
		s1.add(ob4);
		s1.add(ob5);
		s1.add(ob6);
		s1.add(ob7);
		s1.add(ob8);
		s1.add(ob9);
		
		for(Object q1:s1) {
			System.out.println(q1.toString());
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		HashMap<String,Employee> h1= new HashMap<>();
		
		h1.put("mina",ob1);
		h1.put("jia",ob2);
		h1.put("tom",ob3);
		h1.put("kol",ob4);
		h1.put("lim",ob5);
		h1.put("gary",ob6);
		h1.put("pinky",ob7);
		h1.put("kohli",ob8);
		h1.put("pil",ob9);
		h1.put("wes",ob);
		
		for(Map.Entry<String,Employee> p1:h1.entrySet()) {
			System.out.println(p1.getKey()+" "+p1.getValue());
		}
		
		

	}

}
