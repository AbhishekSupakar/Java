class AngelPriya{
  int age;
public int getAge(){
    System.out.println("Hi");
  return age;
}
public static void main(String []args){
System.out.println("bakra trapped in angel priya's walk");
  AngelPriya a1 = new AngelPriya();
  a1.age = 16;
  //calling a method which is returning value
 int result =  a1.getAge();
 System.out.println(result);
System.out.println("bakra dead");
}
}