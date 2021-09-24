package day4;
import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Object> k1=new LinkedList<>();
		k1.add("sam");
		k1.add("mani");
		k1.add(2322);
		k1.add(67.55f);
		k1.add(98);
		k1.add("iintei");
		
				
		System.out.println(k1.peek());
		System.out.println(k1.poll());
		System.out.println(k1);
		System.out.println(k1.isEmpty());
	}

}
