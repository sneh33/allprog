package training;

class Level1{
	Level1(){
	System.out.println("level1");
	}
	}

class Level2 extends Level1{ 
	Level2(){
		System.out.println("level2");
		}
	
}

class Level3 extends Level2{ 
	Level3(){
		System.out.println("level3");
		}
	
}

public class Mult_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level1 n1=new Level1();
		

	}

}
