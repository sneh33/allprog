package day4;
import java.util.ArrayList;
public class Generics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1=new ArrayList();
		a1.add(21);
		a1.add("rose");
		a1.add(435.21);
		
		String g= (String)a1.get(1);
		System.out.println(g);
		
		ArrayList<Integer> s1=new ArrayList<>();
		s1.add(31);
		s1.add(43);
		s1.add(54);
	
		int f=s1.get(2);
		System.out.println(f);
	}

}
