package House;

public class Kitchen {

	public static void main(String[] args) {
		String a[]= new String[5];
		a[0]="Mixer";
		a[1]="oven";
		a[2]="Fridge";
		a[3]="toaster";
		a[4]="Roti_maker";
		
		for(String s:a) {
			System.out.print(s+" ");
		}
		System.out.println();
		int p=a.length;
		String copy[]=new String[p];
		
		for (int i=0;i<p;i++) {
			copy[i]=a[i];
			
		}
		
		for(String s:copy) {
			System.out.print(s+" ");
		}

	}

}
