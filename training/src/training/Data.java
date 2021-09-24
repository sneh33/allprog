package training;


interface car{
	 void neww();
}

class exp{
	void years() {
		System.out.println("34 years");
	}
}

public class Data extends exp implements Emp,car{
	
	public void name() {
		System.out.println("Mehul");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Emp obj =new Data();
		obj.age();
		obj.salary();
		obj.location();
		((Data)obj).name();*/
		
		Data ob=new Data();
		ob.salary();
		ob.neww();
		ob.name();
		ob.years();
	
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("Above 30");
	}

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("Delhi");
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("Above 100000");
	}

	@Override
	public void neww() {
		
		
	}
	
	

}
