class  Employee
{
	int employeeNumber;
	String employeeName;
	double employeeSalary; 
	public Employee(int empid,String name,double fee){
		if (empid > 0)
		{
			this.employeeNumber = empid;
			if (!(name.isEmpty()))
			{
				this.employeeName = name;
			}
			else{
				System.out.println("name must initialize with any ");
			}
			if (fee > 0)
			{
				this.employeeSalary = fee;
			}
			else{
				System.out.println("Fee cannot be negative or zero. ");
			}
		}
		else{
				System.out.println("id must be always positive integer. ");
		}
	}
	public double getemployeeSalary(){
		return employeeSalary;
	}
	public void dispalyDetails(){
		System.out.println();
		System.out.println("Employee name is "+employeeName);
		System.out.println("Employee id is "+employeeNumber);
		System.out.println("Employee salary is "+employeeSalary);
	}
}
