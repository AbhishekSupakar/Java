import java.util.Scanner;

class Person 
{
	String name;
	int age;

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		
		return name;
	}
	public int getAge(){
		
		return age;
	}
	public void Display(){
		System.out.println("Voter Name:"+name);
		System.out.println("Voter Age: "+age);
		if (age>18)
		{
			System.out.println("You is Eligible for voting.");
		}
		else{
			System.out.println("You is Eligible for voting.");
		}

	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
		System.out.print("Enter Your name:");
		String name = sc.nextLine();
		System.out.print("Enter Your age:");
		int age = sc.nextInt();
		p1.setName(name);
		p1.setAge(age);
		p1.name = p1.getName();
		p1.age = p1.getAge();
		p1.Display();
		
	}
}
