
package training;

class teacher{
	final void marks(){
		System.out.println("marks teach");
	}
}

class students extends teacher{
	void name() {
		System.out.println("hello");
	}
}

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students t1=new students();
		t1.marks();
		t1.name();
		final int a=32;
		
		System.out.println(a);

	}

}
