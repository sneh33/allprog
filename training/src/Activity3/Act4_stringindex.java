package Activity3;

public class Act4_stringindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="This is JAVA language";
		try {
		char cha = a.charAt(70);}
		catch(StringIndexOutOfBoundsException e) {
			 System.out.println("Error string"+e);
		}
		finally {
			 System.out.println("Finally block");
		}
	}

}
