package Activity3;

interface Drawable{
	void drawingColor();
	void thickness();
}

interface Fillable{
	void fillingColor();
	void size();
}

class Square implements Drawable,Fillable{

	@Override
	public void fillingColor() {
		System.out.println("Blue");
		
	}

	@Override
	public void size() {
		System.out.println("30");
	}

	@Override
	public void drawingColor() {
		System.out.println("red");
		
	}

	@Override
	public void thickness() {
		System.out.println("3mm");
	}
	
}

class Circle implements Drawable,Fillable{

	@Override
	public void fillingColor() {
	
		System.out.println("Black");
	}

	@Override
	public void size() {
		System.out.println("90");
	}

	@Override
	public void drawingColor() {
		System.out.println("green");
		
	}

	@Override
	public void thickness() {
		System.out.println("19mm");
	}
	
}

class Line implements Drawable,Fillable{

	@Override
	public void fillingColor() {
		System.out.println("pink");
		
	}

	@Override
	public void size() {
		System.out.println("57");
	}

	@Override
	public void drawingColor() {
	
		System.out.println("grey");
	}

	@Override
	public void thickness() {
		System.out.println("4mm");
	}
	
}

public class Act2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1=new Square();
		Line f1=new Line();
		Circle c1=new Circle();
		
		System.out.println("SQUARE");
		s1.drawingColor();
		s1.fillingColor();
		s1.thickness();
		s1.size();
		System.out.println("LINE");
		f1.drawingColor();
		f1.fillingColor();
		f1.thickness();
		f1.size();	
		System.out.println("CIRCLE");
		c1.drawingColor();
		c1.fillingColor();
		c1.thickness();
		c1.size();
		
		
	}

}
