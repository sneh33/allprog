package day4;
import java.util.ArrayList;
import java.util.List;

public class List1 {
	@SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List z1=new ArrayList();
		z1.add(12);
		z1.add("see");
		z1.add(342.3f);
		z1.add("whe");
		z1.add(164);
		z1.add("see");
		System.out.println(z1.get(2));
		z1.add(4,"new");
		z1.set(1, 000000);
		for (Object i:z1) {
			System.out.println(i);
		}
		
		System.out.println(z1.contains(16));

	}

}
