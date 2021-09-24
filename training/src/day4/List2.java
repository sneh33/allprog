package day4;
import java.util.List;
import java.util.ArrayList;
public class List2 {
//@SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a1= new Employee(11,"mina",2344);
		Employee a2=new Employee(32,"Dev",3535);
		Employee a3= new Employee(87,"kuhu",1356);
		Employee a4=new Employee(23,"tina",7578);
		
		
		ArrayList<Employee> m1 =new ArrayList<Employee>();
		m1.add(a1);
		m1.add(a2);
		m1.add(a3);
		m1.add(a4);
		
		
		for(Employee i:m1)
		{
			System.out.println(i.toString());
		}
		
		List<Object> s1= new ArrayList<Object>();
		s1.add("ewqq");
		s1.add(451);
		s1.add("que");
		System.out.println(s1);
		
		s1.add(2, 57);
		System.out.println(s1.get(1));
		System.out.println(s1);
	}

}
