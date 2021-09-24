package Activity3;

class Emp {

    int empid;
    String Name;
    String designation;
    double basic;
    double hra;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasic() {
		
		
		 if (basic < 500) {
	            try {
	                throw new LowSalException();

	            } catch (LowSalException e) {
	               
	                System.out.println(e);
	            }
	        }
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	
	public Emp(int id, String name, String des, double d) {

        empid = id;
        Name = name;
        designation = des;
        basic = d;
    }
	
	public Emp() {

        empid = 1;
        Name = "Mina";
        designation = "Manager";
        basic =2000;
    }
    
	public void printDET() {
        System.out.println("Id :" + empid
                + "\n Name :" + Name
                + "\n Designation :" + designation
                + "\nSalary :" + basic);

    }

    public void calculateHRA() {
        if (designation == "Manager") {

            hra = basic * 0.1;
            System.out.println("HRA_MANAGER : " + hra);
        }

        else if (designation == "Officer") {

            hra = basic * 0.12;
            System.out.println("HRA_OFFICER : " + hra);
        }

        else {

            hra = basic * 0.05;
            System.out.println("HRA_CLERK : " + hra);
        }
    }

}

public class LowSalException extends Exception {

    @Override
    public String toString() {
        return "Opps There is Low Balance Than 500 Reppues";}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp p = new Emp();
        p.getBasic();
        p.printDET();
        System.out.println();
        Emp p1 = new Emp(2, "Paro", "Manager", 70000);
        p1.printDET();
        p1.calculateHRA();
        System.out.println();
        Emp p2=new Emp(3,"Neena","officer",35000);
        p2.printDET();
        p2.calculateHRA();
        System.out.println();
        System.out.println();
        Emp p3=new Emp(4,"Raj","cleark",60000);
        p3.printDET();
        p3.calculateHRA();
	}

}
