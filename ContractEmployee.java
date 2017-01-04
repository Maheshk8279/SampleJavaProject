
public class ContractEmployee extends Employee{
	
	int contractInMonths;

	public ContractEmployee(int id, String name, String designation,int contractInMonths) {
		super(id, name, designation);
		this.contractInMonths = contractInMonths;
	}
	
	
	
	@Override
	public void calculateSalary(int noOfworkDays) {
		
		System.out.println("******ContractEmployee: calculateSalary()********");
		
	}
	

}
