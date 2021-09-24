package training;

class test{
	private int roll;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
}

public class Encapsulation {
	
	int id;
	String name;
	float price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation obj1= new Encapsulation();
		obj1.setId(12);
		obj1.setName("Sam");
		obj1.setPrice(241);
		
		System.out.println("details: "+obj1.getId()+" "+obj1.getName()+" "+obj1.getPrice());
		
		Encapsulation obj2= new Encapsulation();
		obj2.setId(34);
		obj2.setName("him");
		obj2.setPrice(6786);
		
		System.out.println("Details "+obj2.getId()+" "+obj2.getName());
		
		test pro1= new test();
		pro1.setRoll(21);
		System.out.println(pro1.getRoll());
	}

}
