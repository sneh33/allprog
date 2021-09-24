package training;

public class multiarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] q= {
				{1,2,3},
				{21,343,5,45},
				{32,65,1,24,2,35}
				};
		
		for (int i=0;i<q.length;i++) {
			for (int j=0; j<q[i].length;j++)
			{
				System.out.print(q[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("NExt");
		
		for(int i[]:q) {
	
			for(int k:i) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
