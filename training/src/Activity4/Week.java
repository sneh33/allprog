package Activity4;

import java.util.LinkedHashSet;
import java.util.Iterator;
class Array{
	String day;

	@Override
	public String toString() {
		return "Array [day=" + day + "]";
	}
}

public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> w1=new LinkedHashSet<>();
		w1.add("Monday");
		w1.add("Tuesday");
		w1.add("Wednesday");
		w1.add("Thursday");
		w1.add("Friday");
		w1.add("Saturday");
		w1.add("Sunday");
		
		Iterator i1=w1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("Size "+ w1.size());
		
		int n=w1.size();
		String arr[]=new String[n];
		
		int i=0;
		for(String a:w1) {
			arr[i++]=a;
		}
		System.out.println("ARRAY");
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	
	
	
	

}
