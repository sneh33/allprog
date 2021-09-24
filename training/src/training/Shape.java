package training;

public class Shape {
	
	float x,y;
	
	void area(float a) {
		System.out.println("Area of square: "+a*a);
	}
	
	void area(float a,float b) {
		System.out.println("Area of rectangle: "+a*b);
	}
	
	void perimeter(float a) {
		System.out.println("Perimeter of square: "+4*a);
	}
	
	void perimeter(float a, float b) {
		System.out.println("Perimeter of rectangle: "+2*(a+b));
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s1=new Shape();
		s1.area(5);
		s1.area(3,7);
		s1.perimeter(8);
		s1.perimeter(6,10);

	}

}
