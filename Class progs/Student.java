class Student{
	String name;
	String section;
	static int Subjects =5;
	public static void main(String []args){
		Student s1= new Student();
		s1.name="Abhishek Supakar";
		s1.section="A";
		System.out.println("Student name: "+s1.name);
		System.out.println("Student section: "+s1.section);
		System.out.println("Student name: "+Subjects);
	}
}