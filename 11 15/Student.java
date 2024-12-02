class Student{
  String name;//instance variable
  int age; //instance variable
  static String course="FSJD";//static variable
  public static void main(String []args){
  Student s1 = new Student();
  Student s2 = new Student();
  s1.name = "James Gosling";
  s1.age = 16;
  s2.name = "Tamanna";
  s2.age = 30;
  System.out.println("Name of s1: "+s1.name);
  System.out.println("Age of s1: "+s1.age);
  System.out.println("Course: "+course);
  System.out.println();
  System.out.println("Name of s2: "+s2.name);
  System.out.println("Age of s2: "+s2.age);
  System.out.println("Course: "+course);
  System.out.println();


  }
}