package training;
import java.util.Scanner;

public class Activity1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 =new Scanner(System.in);
		
		double totalRetail=0;
		
		while(true){

		System.out.println("1 - Product 1, 22.50");
		System.out.println("2 - Product 2, 44.50");
		System.out.println("3 - Product 3, 9.98");
		System.out.println("3 - Product 0");
		
		System.out.print("Enter product number: ");
		int productnumber=s1.nextInt();
		
		if(productnumber==0){
			break;}

		System.out.print("Enter quantity sold: ");
		int quantitySold=s1.nextInt();
		
		switch(productnumber){
		case 1:
		totalRetail+=22.50*quantitySold;
		break;
		case 2:
		totalRetail+=44.50*quantitySold;
		break;
		case 3:
		totalRetail+=9.98*quantitySold;
		break;
	
	}
		System.out.println(" value of all products sold"+totalRetail);

}
}
}