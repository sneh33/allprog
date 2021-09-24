package Finance;

class Dailyworker implements Payable{
	
	@Override
	public void getPayInfo() {
		 System.out.println("20000");
	}
	
}

class SalariedWorker implements Payable{

	@Override
	public void getPayInfo() {
		 System.out.println("40000");

	}
	
}

public class Worker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalariedWorker s1=new SalariedWorker();
		Dailyworker o1=new Dailyworker();
		s1.getPayInfo();
		o1.getPayInfo();

	}

}
