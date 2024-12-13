import java.util.Scanner;

class Employee 
{
	String name;
	String department;
	double salary;
	boolean active;
	public void setName(String name){
		this.name = name;
	}

	public void setDepartment(String department){
		this.department = department;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public void setActive(boolean active){
		this.active = active;
	}

	public String getName(){
		return name;
	}

	public String getDepartment(){
		return department;
	}

	public double getSalary(){
		return salary;
	}

	public boolean isActive(){
		return active;
	}

	public void Display(){
		System.out.println("Name of the employee: "+name);
		System.out.println("Department of the employee: "+department);
		System.out.println("Salary of the employee: "+salary);
		System.out.println("Is employee active? "+active);
	}
	public void CheckEligibility(){
		if (active == true && salary<50000)
		{
			double Increment = salary*0.1;
			System.out.println("Your salay hike will be:  "+Increment);
		}
		else{
			System.out.println("You are not eligible for Increment.. ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		System.out.print("Enter employee name: ");
		String name = sc.nextLine();
		System.out.print("Enter employee department: ");
		String department = sc.nextLine();
		System.out.print("Enter employee salary: ");
		double salary = sc.nextDouble();
		System.out.print("Is employee active?  ");
		boolean active  = sc.nextBoolean();
		
		e1.setName(name);
		e1.setDepartment(department);
		e1.setSalary(salary);
		e1.setActive(active);

		e1.Display();
		e1.CheckEligibility();

	

		

	}
}
