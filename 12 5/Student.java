import java.util.Scanner;

class Student 
{
	String name;
	int age;
	char grade;
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setGrade(char grade){
		this.grade = grade;
	}
	public String getName(){
		
		return name;
	}
	public int getAge(){
		
		return age;
	}

	public char getGrade(){
		
		return grade;
	}
	public void calculateGrade(double score1, double score2, double score3, double score4){
		double totalScore = score1+score2+score3+score4;
		double FullScore = totalScore/4;
		if (FullScore>=90 && FullScore<=100)
		{
			this.grade = 'A';
		}
		else if (FullScore>=80 && FullScore<=89)
		{
			this.grade = 'B';
		}
		else if (FullScore>=70 && FullScore<=79)
		{
			this.grade = 'C';
		}
		else if (FullScore>=60 && FullScore<=69)
		{
			this.grade = 'D';
		}
		else{
			this.grade = 'F';
		}
	}
	public void Display(){
		System.out.println("Student Name:"+name);
		System.out.println("Student Age: "+age);
		System.out.println("Student Grade: "+grade);

	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.print("Enter Your name:");
		String name = sc.nextLine();
		System.out.print("Enter Your age:");
		int age = sc.nextInt();
		System.out.print("Enter Your Scores for 'Four' subjects: ");
		double score1 = sc.nextDouble();
		double score2 = sc.nextDouble();
		double score3 = sc.nextDouble();
		double score4 = sc.nextDouble();
		

		s1.setName(name);
		s1.setAge(age);
		//s1.setGrade(grade);
		s1.name = s1.getName();
		s1.age = s1.getAge();
		s1.grade = s1.getGrade();
		s1.calculateGrade( score1, score2,  score3,  score4);
		s1.Display();
		
	}
}
