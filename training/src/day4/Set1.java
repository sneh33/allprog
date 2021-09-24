package day4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

class Employee{
	int id;
	String name;
	int sal;
	public Employee(int id, String name, int sal) {
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
public class Set1 {
	@SuppressWarnings({"unchecked","rawtypes"})

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a1= new Employee(11,"mina",2344);
		Employee a2=new Employee(32,"Dev",3535);
		Employee a3= new Employee(87,"kuhu",1356);
		Employee a4=new Employee(23,"tina",7578);
		
		HashSet ob= new HashSet();
		ob.add(a1);
		ob.add(a2);
		ob.add(a3);
		ob.add(a4);
		
		Iterator k1= ob.iterator();
		while(k1.hasNext()) {
			System.out.println(k1.next());
		}
		System.out.println(ob.size());
		System.out.println("LINKEDHASH");
		LinkedHashSet b2=new LinkedHashSet();
		b2.add(a1);
		b2.add(a2);
		b2.add(a3);
		b2.add(a4);
		
		for(Object i:b2) {
			System.out.println(i);
		}
		
		
	
	}

}
