package training;
class Block1
{
static
{
	System.out.println("Static Block 1 in another class!");	
}
static
{
	System.out.println("Static Block 2 in another class!");	
}
Block1()
{
	System.out.println("Default Constructor of Block1 class!");
}
}
public class Block {

	public static void main(String[] args) {
		System.out.println("Main Method Loaded now!!!!");
		
		// TODO Auto-generated method stub
		/*static
		{
		System.out.println("Static Block :::: 1");
		//System.out.println("Ip:: "+ipaddress);
		}*/
		Block1 obj=new Block1();

	}

}
