class Tester 
{
	public void checkDepartment(double employeeSalary){
		if (employeeSalary < 40000)
		{
			System.out.println("Employee is a Tester.");
		}
		else if (employeeSalary >= 40000 && employeeSalary < 60000)
		{
			System.out.println("Employee is a Desiner.");
		}
		else if (employeeSalary >= 60000)
		{
			System.out.println("Employee is a Developer.");
		}
	}
	public static void main(String[] args) 
	{
		Tester t1 = new Tester();
		Employee e1 = new Employee(101,"John Doe",50000);
		double salary = e1.getemployeeSalary();
		e1.dispalyDetails();
		t1.checkDepartment(salary);

		Employee e2 = new Employee(102,"Jonny Munda",39000);
		salary = e2.getemployeeSalary();
		e2.dispalyDetails();
		t1.checkDepartment(salary);

		Employee e3 = new Employee(103,"Mia Malati",70000);
		salary = e3.getemployeeSalary();
		e3.dispalyDetails();
		t1.checkDepartment(salary);
	}
}
