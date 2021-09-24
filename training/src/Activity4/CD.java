package Activity4;

import java.util.ArrayList;
import java.util.Collections;

class CD1 implements Comparable<CD1>{
	int title;
	String Singer;
	public CD1(int title, String Singer) {
		super();
		this.title = title;
		this.Singer = Singer;
	}
	@Override
	public String toString() {
		return  title +" "+ Singer ;
	}
	@Override
	public int compareTo(CD1 q) {
		// TODO Auto-generated method stub
		if (title==q.title)
		{return 0;}
		
		else if (title>q.title)
			{return 1;}
		
		else
			{return -1;}
	}
	
	
	
}

public class CD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CD1 a1=new CD1(11,"Shaan");
		CD1 a2=new CD1(34,"Shreya");
		CD1 a3=new CD1(86,"KK");
		CD1 a4=new CD1(12,"Mukesh");
		CD1 a5=new CD1(45,"Dimple");
		CD1 a6=new CD1(76,"Shekhar");
		CD1 a7=new CD1(02,"Mira");
		
		ArrayList<CD1> s1=new ArrayList<>();
		s1.add(a1);
		s1.add(a2);
		s1.add(a3);
		s1.add(a4);
		s1.add(a5);
		s1.add(a6);
		s1.add(a7);
		
		for(CD1 p:s1){
			System.out.println(p);
		}
		
		System.out.println("after sorting");
		
		Collections.sort(s1);
		
		for(CD1 p:s1){
			System.out.println(p);
		}

	}
	
	

}
