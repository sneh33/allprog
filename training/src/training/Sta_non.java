package training;

class Stat{
	static void disp()
	{
		System.out.println("Stat");
	}
}

public class Sta_non {
	
	int a=321;
	static int b=423;
	static int c=2;
	
	void display()
	{
		System.out.println("non-Stat");
		test();
	}
	
	static void test() {
		System.out.println("Stat-test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sta_non obj=new Sta_non();
		obj.display();
		
	}

}
