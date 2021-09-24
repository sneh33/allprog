package Activity3;
/*Create a class by name Employee with members – Employee ID, Name andyear of birth. The Employee ID is a string that contains the ID in the 
 * formatyear-designation-number. The year is represented with the last two digits. Thedesignation is a single letter code - 'F' for faculty 
 * and 'S' for staff.

The numberis a 3 digit number.(Example:81-F-112     79-S-254)*/
class Employee{
	String EmployeeID;
	String Name;
	int YearofBirth;
	public Employee(String employeeID, String name, int yearofBirth) {
		super();
		EmployeeID = employeeID;
		Name = name;
		YearofBirth = yearofBirth;
	}
	
	
	
}

public class Emps {

	public static void main(String[] args) {
		Employee n2=new Employee();
		
	}

}
