package training;

abstract class Principal{
	abstract void dept();
	abstract void school();
}

abstract class Stud extends Principal{
	void choc() {
		System.out.println("student");
	}
	
	void dept() {
		System.out.println("math");
	}
	
}

class ro extends Stud{
	void cj() {}

	@Override
	void school() {
		// TODO Auto-generated method stub
		
	}
}

class staff extends Principal{
	
	void dept() {
		System.out.println("physics");
	}
	void school() {
		System.out.println("new era");
	}
	void fb() {
		System.out.println("Teaching");
	}
}

public class Abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staff ob= new staff();
		ob.school();
		ob.fb();
	
		
		Principal obj1= new staff();
		obj1.school();
		((staff)obj1).fb();
		
		ro nw= new ro();
		nw.choc();

	}

}
