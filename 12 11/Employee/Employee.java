import java.util.Scanner;
class Employee 
{
	String firstName;
	String lastName;
	int employeeId; 
	double salary;  
	int NoOfProject;
	Employee(String firstName,String lastName,int employeeId,double salary,int NoOfProject){
			this.firstName = firstName;
			this.lastName = lastName;
			this.employeeId = employeeId;
			this.salary = salary;
			if (NoOfProject > 0)
			{
				this.NoOfProject = NoOfProject;
			}
			else{
				Scanner sc = new Scanner(System.in);
				System.out.println("Employee NoOfProject can not be negative or zero");
				System.out.print("Enter valid no of projects: ");
				this.NoOfProject = sc.nextInt();
				
			}
			
	}
	public void calculateSalary(){
			if (NoOfProject > 5 && NoOfProject < 10)
			{
				salary+= 5000;
			}
			else if (NoOfProject >= 10 && NoOfProject < 20)
			{
				salary+=10000;
			}
			else if (NoOfProject >= 20 )
			{
				salary+=15000;
			}
			else{
				salary+=0;
			}
	}
	public void displayDetails(){
		System.out.println("Employee first name: "+firstName);
		System.out.println("Employee last name: "+lastName);
		System.out.println("Employee employeeId: "+employeeId);
		System.out.println("Employee salary: "+salary);
		System.out.println("Employee NoOfProject: "+NoOfProject);

	}
}
