package training;

class now{
	String name;
	String address;
	public now(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		
	}
	@Override
	public String toString() {
		return "now [name=" + name + ", address=" + address + "]";
	}
	
}

public class Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		now s1= new now("mina","delhi");
		
		System.out.println("details:"+s1.name+" "+s1.address);
		System.out.println("add"+ s1);
		
		

	}

}
