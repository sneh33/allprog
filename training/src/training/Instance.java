package training;

class A1{
	
}

class B1
{
}

class C1 extends A1{}

class D1 extends A1{}

public class Instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1();
		B1 b=new B1();
		C1 c=new C1();
		D1 d= new D1();
		
		if (d instanceof A1){
			System.out.println("Hello");
			}
		
		A1 ob;
		ob=d;
		if (ob instanceof A1){
			System.out.println("Hello");
			}
		
		String name="sda";
		if (name instanceof Object){
			System.out.println("He");
			}
		
	}
	

}
