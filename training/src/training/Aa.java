package training;
/*
 * Inheritance::
 *  * --Reusability of the code
 * --one class acquires the properties of another class!
 *  * --"is a relationship" ex: House  is a Building
* class Building
 * {
 * }
 * class House extends Building
 * {
 * }
 * class Office extends Building
 * {
 * }
 *  --unidirectional in nature!!!!!!
*/
//Hierarchical Inheritance
class Mob
{
	int iemicode=6566;
	public void operations()
	{
		System.out.println("Dial,Receive,Send Msg..");
	}
	public void show()
	{
		System.out.println("Mobile Class Show()");
	}

}
class Sam extends Mob
{
	int iemicode=7968;
	public void connectivity()
	{
		System.out.println("Samsung:: WIFI+GPS!");
	}
	public void camera()
	{
		System.out.println("Samsung::ReaR fLASH LEDS,Ambient Light Sensors!");
	}
	//method overriding(run time polymorphism)
	//base and derived class contain same method signature!!
	public void show()	
	{
		super.show();//prevent method overriding!!!!!
		System.out.println("Samsung class Show()");
		//super keyword=>refer immediate super class
		//this=> refers current class
		System.out.println("IEMI CODE:: "+this.iemicode + " "+super.iemicode);
	}
}
class App extends Mob
{
	public void features()
	{
		System.out.println("Iphone::iMessage,Timestamps,Sleep timers,Screen timer!");
	}
}
public class Aa
{
	public static void main(String[] args)
	{
		Sam s1=new Sam();
		App a1=new App();
		s1.operations();//base class method but called via derived class object
		s1.camera();
		s1.connectivity();
		s1.show();//calls Mobile class show()
		a1.operations();
		a1.features();
	
	}

}