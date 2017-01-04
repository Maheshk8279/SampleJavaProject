
public abstract class Employee {
	
	int id;
	String name;
	String designation;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	
	public abstract void calculateSalary(int noOfworkDays);

	public void getDetails(){
		
		System.out.println("Id   : "+id);
		System.out.println("Name : "+name);
		System.out.println("Designation : "+designation);
	}
}
