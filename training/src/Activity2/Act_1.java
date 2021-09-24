package Activity2;
import java.util.Scanner;
class Student{
	int Rollno;
	String StudName;
	int Marksineng;
	int Marksinmaths;
	int Marksinscience;
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public int getMarksineng() {
		return Marksineng;
	}
	public void setMarksineng(int marksineng) {
		Marksineng = marksineng;
	}
	public int getMarksinmaths() {
		return Marksinmaths;
	}
	public void setMarksinmaths(int marksinmaths) {
		Marksinmaths = marksinmaths;
	}
	public int getMarksinscience() {
		return Marksinscience;
	}
	public void setMarksinscience(int marksinscience) {
		Marksinscience = marksinscience;
	}
	
	
}

public class Act_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj[] =new Student[3];
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<obj.length;i++)
		{
			System.out.println("Rollno " +(i+1)+" :: ");
			int t=s1.nextInt();
			s1.nextLine();
			System.out.println("Studentname " +(i+1)+ " :: ");
			String t1=s1.nextLine();
			System.out.println("marks in eng " +(i+1)+ " :: ");
			int t11=s1.nextInt();
			System.out.println("marks in math " +(i+1)+ " :: ");
			int t12=s1.nextInt();
			System.out.println("marks in science " +(i+1)+ " :: ");
			int t13=s1.nextInt();
			

			obj[i]=new Student();//cobj[0],cobj[1],cobj[2]
			obj[i].setRollno(t);
			obj[i].setStudName(t1);
			obj[i].setMarksineng(t11);
			obj[i].setMarksinmaths(t12);
			obj[i].setMarksinscience(t13);
			
		}
		int a;
		for(int i=0;i<obj.length;i++) {
			for(int j=1;j<obj.length;j++) {
				if (obj[i].getMarksinmaths() > obj[j].getMarksinmaths()){
					a=obj[i].getMarksinmaths();
					System.out.println("HEEL"+a);
				}
			}
		}
		
	
	}

}
