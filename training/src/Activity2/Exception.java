package Activity2;

public class Exception extends Throwable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a[]=new int[8];
			a[3]=235;
			System.out.println("try "+23/0);
		}
		
		catch(Throwable e) {
			System.out.println("catch block "+e);
			e.printStackTrace();
		}
		
		
		finally {
			System.out.println("final block");
		}
		

	}

}
