class Employee 
{
	String name,dept,designation;
	int employee_id;
	//static double Bonus,salary,percentage;

	public void ShowDetails(){
		System.out.println("Employee name: "+name);
		System.out.println("Employee department: "+dept);
		System.out.println("Employee designation: "+designation);
		System.out.println("Employee id: "+employee_id);

	}
	public static void calculateBonus(double salary, double percentage){
		double Bonus=salary*(percentage/100);
		System.out.println("Employee Bonus: "+Bonus);
	}
	public static void main(String[] args) 
	{
		double salary,percentage;
		System.out.println("---------------------------Employe 1------------------------");
		Employee e1=new Employee();
		e1.name="Kartik";
		e1.dept="DEveloper";
		e1.designation="Developer";
		e1.employee_id=12233;
		percentage=10;
		salary=50000;
		e1.ShowDetails();
		calculateBonus(percentage,salary);
		System.out.println("---------------------------Employe 2------------------------");
		Employee e2=new Employee();
		e2.name="Roman";
		e2.dept="DEveloper";
		e2.designation="SoftWare Developer";
		e2.employee_id=11243;
		percentage=10;
		salary=30000;
		e2.ShowDetails();
		calculateBonus(percentage,salary);
		System.out.println("---------------------------Employe 3------------------------");
		Employee e3=new Employee();
		e3.name="Navin";
		e3.dept="DEveloper";
		e3.designation="SoftWare Developer";
		e3.employee_id=18743;
		percentage=10;
		salary=40000;
		e3.ShowDetails();
		calculateBonus(percentage,salary);
	}
}