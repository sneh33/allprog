package Activity4;
import java.util.LinkedList;
import java.util.Queue;

import java.util.Iterator;

public class Bangles {

	public static void main(String[] args) {
		Queue<Integer> d1=new LinkedList<>();
		
		d1.add(1);
		d1.add(2);
		d1.add(3);
		d1.add(4);
		d1.add(5);
		d1.add(6);
		d1.add(7);
		d1.add(8);
		d1.add(9);
		d1.add(10);
		d1.add(11);
		d1.add(12);
		
		for(int p:d1) {
			System.out.println(p);
		}
		d1.poll();
		System.out.println("After removing 1 bangle ");
		for(int p:d1) {
			System.out.println(p);
		}
		
		System.out.println("After removing all bangle ");
		
		Iterator t1=d1.iterator();
		while(t1.hasNext())
		{
			d1.poll();
		}
		
	

	}

}
