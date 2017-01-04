
public class PermanentEmployee extends Employee{
	
	String retirementDate;

	public PermanentEmployee(int id, String name, String designation,String retirementDate) {
		super(id, name, designation);
		this.retirementDate = retirementDate;
	}
	
	@Override
	public void calculateSalary(int noOfworkDays) {
		
		System.out.println("******PermanentEmployee: calculateSalary()********");
		
	}
	

}
