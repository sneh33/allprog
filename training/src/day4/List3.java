package day4;

import java.util.LinkedList;

public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a1= new Employee(11,"mina",2344);
		Employee a2=new Employee(32,"Dev",3535);
		Employee a3= new Employee(87,"kuhu",1356);
		Employee a4=new Employee(23,"tina",7578);
		
		
		LinkedList<Employee> m1 =new LinkedList<Employee>();
		m1.add(a1);
		m1.add(a2);
		m1.add(a3);
		m1.add(a4);
		
		m1.addFirst(a3);
		for(Employee i : m1)
		{
			System.out.println(i.toString());
		}
	}

}
