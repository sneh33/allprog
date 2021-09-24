package training;
class Mobile{
	int emino=4564;
	public void operations() {
		System.out.println("Call");
	}
	
	public void show() {
		System.out.println("Show mobile");
	}
} 

class Samsung extends Mobile{
	int emino=4788;
	public void connect() {
		System.out.println("High connect");
	}
	
	public void show()
	{
		//super.show();
		System.out.println("Show sam");
	}
	
}

class Nokia extends Mobile{ 
	public void news() {
		System.out.println("nokia ");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Mobile ob[]= {
				new Mobile(),
				new Samsung(),
				new Nokia()
		};
		
		ob[0].show();
		ob[1].show();
		((Samsung)ob[1]).connect();
		ob[0].operations();
		
		((Nokia)ob[2]).news();
		//Samsung s1= new Samsung();
		//s1.operations();
		//s1.show();
		/*Mobile obj=new Samsung();
		obj.show();
		
		((Samsung)obj).connect();
		((Samsung)obj).show();
		((Mobile)obj).operations();
		*/
	}

}
