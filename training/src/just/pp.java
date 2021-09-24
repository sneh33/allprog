package just;

import java.io.IOException;
//In the calling chain of method calls, Checked Exception has to be 
//HANDLED COMPULSORY with the 
//help of throws keyword

/*
 * Throws keyword::
 * --alternative of try---catch block
 * --throws followed by classnames!(NO NEW KEYWORD!)
 * --throws used in the METHOD SIGNATURES!
 * --contains multiple exception also
 * ex: 
 * public void disp() throws IOException,SQLException,ArithmeticException
 * {
 * }
 */

public class pp
{
	void test3() throws IOException
	{
		throw new IOException();//CheckedException generated
	}
	void test2()throws IOException
	{
		test3();	//test2 calling test3()
	}
	void test1()
	{
		try
		{
			test2();//test1 calling test2()
		}
		catch(Exception e)
		{
			System.out.println("Exception handled only in test1()");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		pp obj=new pp();
		obj.test1();
		System.out.println("Program continue!");
		
		String i=String.valueOf(65656.545f);
		String i1=String.valueOf(3343.6565d);
		System.out.println("ValueOf():: "+i + " "+i1);
		
		String str1="India";
		str1.toUpperCase();
		System.out.println("String(Immutable):: "+str1);
		System.out.println("String:: "+str1.toUpperCase());
		System.out.println("String(Immutable):: "+str1);
		String str2=str1.toUpperCase();
		System.out.println(str2 + " "+str1);

	}

}