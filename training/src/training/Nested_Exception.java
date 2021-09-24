package training;

public class Nested_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				
				int a[]= new int[7];
				a[543]=64;
			System.out.println("outer try"+23/0);
			}
			
			catch(ArithmeticException e) {
				System.out.println("inner catch "+e);
				
			}
			
			finally {
				System.out.println("inner finally");
			}
		}
		
		catch(Throwable e){
			
			System.out.println("outercatch "+e);
			
		}
		
		finally {
			System.out.println("outer finally");
		}

	}

}
