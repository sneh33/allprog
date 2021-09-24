package training;

interface bus{
	void wheel();
	void driver();
}

abstract class cars implements bus{
	abstract void color();
	@Override
	public
	void wheel() {
		System.out.println("4");
	}
	
}

class ABC extends cars{
	void del() {
		System.out.println("delete");
	}

	@Override
	public void driver() {
		// TODO Auto-generated method stub
		System.out.println("nill");
	}

	@Override
	void color() {
		// TODO Auto-generated method stub
		System.out.println("blue");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABC obj=new ABC();
		obj.wheel();
		obj.driver();
		obj.color();
		

	}

}
