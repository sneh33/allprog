package training;


public class Calculator
{
	int a,b;
	void add(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("Add:: "+(a+b));
	}

	void diff(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("Difference:: "+(a-b));
	}
	void mul(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("Multiply:: "+(a*b));
	}
	void div(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("Division:: "+(a/b));
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1= new Calculator();
		c1.add(12, 21);
		c1.diff(32, 10);
	
		c1.div(50, 10);
		
		c1.mul(32, 10);
		

	}
}

