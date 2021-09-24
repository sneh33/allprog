package Activity4;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
//Create a class called BookStore with fields Bookid and Bookname.  Sort using comparator and 
//display the output by sorting based on book name and book id.

class Bookstore{
	int Bookid;
	String Bookname;
	
	public Bookstore(int bookid, String bookname) {
		super();
		Bookid = bookid;
		Bookname = bookname;
	}
	@Override
	public String toString() {
		return  Bookid +" "+Bookname ;
	}
	
}

class Name implements Comparator<Bookstore>{

	@Override
	public int compare(Bookstore p1, Bookstore p2) {
		// TODO Auto-generated method stub
		return p1.Bookname.compareTo(p2.Bookname);
		
	}
	
}

class Years implements Comparator<Bookstore>{

	@Override
	public int compare(Bookstore q1, Bookstore q2) {
		// TODO Auto-generated method stub
		if (q1.Bookid==q2.Bookid)
		{return 0;}
		
		else if (q1.Bookid>q2.Bookid)
			{return 1;}
		
		else
			{return -1;}
	}
	
}

public class Books {

	public static void main(String[] args) {
		Bookstore b =new Bookstore(21,"perfect");
		Bookstore b1 =new Bookstore(78,"wizards");
		Bookstore b2=new Bookstore(22,"fairy");
		Bookstore b3 =new Bookstore(45,"Kings");
		Bookstore b4 =new Bookstore(30,"Family");
		Bookstore b5 =new Bookstore(75,"Tales");
		
		ArrayList<Bookstore> a1=new ArrayList<>();
		a1.add(b);
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		a1.add(b4);
		a1.add(b5);
		
		for(Bookstore f1:a1) {
			System.out.println(f1);
		}
		
		Collections.sort(a1,new Name());
		
		System.out.println("After sorting");
		for(Bookstore f1:a1) {
			System.out.println(f1);
		}
		
		

	}

}
