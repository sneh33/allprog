package training;

class Counter
{
	static int count;//class variable
	//int count;//non static data member or instance varible
	public Counter()
	{
		count++;count++;count++;count++;count++;count++;count++;
	}
	public int totalhits()
	{
		return count;
	}	
}

public class Statdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1=new Counter();
		System.out.println("aa"+c1.totalhits());

	}

}
