class Tester 
{
	public static void main(String[] args) 
	{
		
		Employee e1 = new Employee("John","Doe",101,50000,7);
		System.out.println();
		e1.calculateSalary();
		e1.displayDetails();
		System.out.println();
		Employee e2 = new Employee("Michael","Johnson",105,45000,-1);
		System.out.println();
		e2.calculateSalary();
		e2.displayDetails();
		System.out.println();
	}
}
