package just;
import java.util.HashMap;
import java.io.*;
import java.util.Map;

class Mina{
	String Name;
	String Class;
	String No;}
	
	
}
public class Csvdemo {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashMap<String,Mina> noow=new HashMap<>();
		String file= "D:\\Demo.csv";
		BufferedReader reader=null;
		String line="";
		  
		
		try {
			reader=new BufferedReader(new FileReader(file));
			while ((line=reader.readLine()) != null) {
				
				String[] row=line.split(",");
				Mina obj=new Mina();
				obj.Name=row[0];
				obj.Class=row[1];
				obj.No=row[2];
				

				noow.put(row[2],obj);
				
				//for(String m:noow.keySet()) {
					//System.out.printf(m +" ");
				//}
				
				for(Map.Entry<String, Mina> s1: noow.entrySet())
				{
					System.out.println("Key&Value:: "+s1.getKey() + " "+s1.getValue());
				}
				//System.out.printf(noow.toString());
				/*for (String index:row) {
					System.out.printf("%10s", index);
				}
				System.out.println();*/
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			reader.close();
		}

	}

}
