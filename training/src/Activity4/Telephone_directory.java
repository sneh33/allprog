package Activity4;
import java.util.HashMap;
import java.util.Map;

public class Telephone_directory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> h1= new HashMap<>();
		h1.put("Mina",1254548754);
		h1.put("Rina",456498277);
		h1.put("jay",897454564);
		

		for(Map.Entry<String, Integer> e1: h1.entrySet())
		{
			System.out.println("Key&Value:: "+e1.getKey() + " "+e1.getValue());
		}
	}

}
