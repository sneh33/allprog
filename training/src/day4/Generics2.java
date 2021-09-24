package day4;
import java.util.ArrayList;
import java.util.List;

public class Generics2 {
	static void view(List<String> b) {
		for(String i:b){
			System.out.println(i);
		}}
		
		static void view1(List<?> b) {
			for(Object i:b){
				System.out.println(i);
			}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(11);
		a1.add(35);
		a1.add(76);

		ArrayList<String> a2=new ArrayList<>();
		a2.add("rim");
		a2.add("pen");
		a2.add("76");
		
		ArrayList<Float> a3=new ArrayList<>();
		a3.add(112.233f);
		a3.add(12.43f);
		a3.add(45.56f);
		
		view1(a1);
		view(a2);
		
	}

}
