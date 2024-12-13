class TestQ
{
	String name;
	String Rollno;
	public void enterDetails(String name,String Rollno){
		this.name = name;
		this.Rollno = Rollno;
	}
	public void Display()
	{
		System.out.println("======Student Details======");
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll no.: "+Rollno);
		System.out.println("============================");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		TestQ a1 = new TestQ();
		a1.enterDetails("Abhishek","20CSE115");
		a1.Display();
		TestQ a2 = new TestQ();
		a2.enterDetails("Subhendu","20CSE114");
		a2.Display();
		TestQ a3 = new TestQ();
		a3.enterDetails("Armaan","20CSE116");
		a3.Display();
	}
}
