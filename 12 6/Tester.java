class Employee 
{
	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int noOfProjects;
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setEmployeeID(int employeeId){
		this.employeeId = employeeId;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public void setNumberOfProjects(int noOfProjects){
		this.noOfProjects = noOfProjects;
	}
	
}

class Tester
{
	public void displayEmployeeDetails(Employee e1){
		System.out.println("Employee Name: "+e1.firstName+ " "+e1.lastName);
		System.out.println("Employee ID: "+e1.employeeId);
		System.out.println("Employee salary: "+e1.salary);
		System.out.println("Employee 's Number of projects: "+e1.noOfProjects);
	}

	public void calculateSalary(Employee e1){
		if (e1.noOfProjects>=5 && e1.noOfProjects<10)
		{
			e1.salary+=5000;
		}
		else if (e1.noOfProjects>=10 && e1.noOfProjects<20)
		{
			e1.salary+=10000;
		}
		else if (e1.noOfProjects>=20)
		{
			e1.salary+=15000;
		}
		else{
			e1.salary+=0;
		}
		System.out.println();
		System.out.println("Employee salary based on Number of projects done : " +e1.salary);
		System.out.println();
	}

	public static void main(String[] args) 
	{
		
		Employee b1 = new Employee();
		Tester e1 = new Tester();
		b1.setFirstName("Abhishek");
		b1.setLastName("Supakar");
		b1.setEmployeeID(115234);
		b1.setSalary(35000);
		b1.setNumberOfProjects(6);

		e1.displayEmployeeDetails(b1);
		e1.calculateSalary(b1);
	}
}
