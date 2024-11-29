import java.util.Scanner;
class Details 
{
	String name;
	int age,PassYear;
	public void Display()
	{
		System.out.println("------Details--------");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Graduation Year: "+PassYear);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Details A1 = new Details();
		System.out.print("Enetr Your name: ");
		A1.name = sc.nextLine();
		//if get some problem like don't get any input from user then
		//use this
		//sc.nextLine(); 
		//Don't store it
		System.out.print("Enetr Your age:");
		A1.age = sc.nextInt();
		System.out.print("Enetr Your Pass Year: ");
		A1.PassYear = sc.nextInt();
		A1.Display();
		
	}
}
