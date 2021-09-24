package training;

interface AAA{
	void c1();
}

interface A2{
	void c2();
}

interface A3 extends AAA,A2 {
	void c3();
}

public class Inheritancess implements A3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 no=new Inheritancess();
		no.c1();
		no.c2();
		
		if (no instanceof AAA) {
			System.out.println("Yes");
		}

	}

	@Override
	public void c1() {
		// TODO Auto-generated method stub
		System.out.println("1111");
	}

	@Override
	public void c2() {
		// TODO Auto-generated method stub
		System.out.println("2222");
	}

	@Override
	public void c3() {
		// TODO Auto-generated method stub
		System.out.println("3333");
	}

}
