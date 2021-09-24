package Activity2;

class Vehicl{
	public void Route (){
		System.out.println("Road");
	}
	
}

class Bus extends Vehicl{ 
	public void Route(){
		super.Route();
		System.out.println("Road");
	}
	
	public void type() {
		System.out.println("Luxury");
	}
}

class Car extends Vehicl{ 
	
	public void Wheels() {
	System.out.println("4 wheeler");
	}
}

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vehicl obj[]= {
				new Bus(),
				new Car()
		};

		obj[0].Route();
		((Bus)obj[0]).type();
		//((Vehicl)obj[1]).Wheels();
	}

}
