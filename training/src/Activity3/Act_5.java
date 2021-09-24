package Activity3;
/* 
 * By using multiple catch blocks, write a class to demonstrate the order of the execution of the 
catch blocks usingNegativeArraySizeException,ArrayIndexOutOfBoundsException, 
StringIndexOutOfBoundsException, IndexOutOfBoundsException, NullPointerException,          
ArithmeticException and print the stack trace for each exception.
*/
public class Act_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a[]=new int[7];
			a[3]=423;
			System.out.println("try block"+23/0);
			String str=null;
			String p="Hello this is java";
			char cha = p.charAt(70);
		}
		
		catch(NegativeArraySizeException e) {
			System.out.println("negative array "+ e);
		}

		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index out of bounds array "+ e);
		}
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("string out of bounds "+ e);
		}
		
		catch( IndexOutOfBoundsException e) {
			System.out.println("index out of bounds "+ e);
		}
		
		catch(NullPointerException e) {
			System.out.println("null pointer "+ e);
		}
		
		catch(ArithmeticException e) {
			System.out.println("arithmetic  "+ e);
		}
		
		finally {System.out.println("Finally block");}
	} 

}
