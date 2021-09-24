package training;

class Emps{
	int eno;
	String name;
	public Emps(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}
	
	public int cal() {return 0;}
}

class Salemp extends Emps{
	int net_sal;
	
	public Salemp(int eno, String name, int net_sal) {
		super(eno, name);
		this.net_sal = net_sal;
	}
	@Override

	public int cal() {
		return net_sal*10;
	}
}

class Manemps extends Emps{
	int wag;

	public Manemps(int eno, String name, int wag) {
		super(eno, name);
		this.wag = wag;
	}

	public int cal() {
		return wag*20;
	}
	
}

public class const_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emps obj[]= {
				new Salemp(11,"sad",646),
				new Manemps(12,"wewr",465)
		};
		
		obj[1].cal();
		for(int i=0;i<obj.length;i++)//2
		{
			System.out.println(obj[i].getClass()+ " "+obj[i].eno + " "+obj[i].name + " "+obj[i].cal());
			obj[i].cal();
		}

	}

}
