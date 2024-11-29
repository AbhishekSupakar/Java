class Samplee
{
	public static void staticMethodC1(){
		System.out.println("Hello World! for static method in Class Samplee.");
	}
	public void nonStaticMethodC2(){
		System.out.println("Hello World! for non static method in class Samplee.");
	}
}

class SampleFor29_11
{
	
	public static void staticMethod(){
		System.out.println("Hello World! for static method");
	}
	public void nonStaticMethod(){
		System.out.println("Hello World! for non static method");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World! for main !!");
		Sample01 a = new Sample01();
		a.nonStaticMethod();
		staticMethod();
		System.out.println();
		System.out.println("Hello World! for Another class Samplee!!");
		System.out.println();
		Samplee.staticMethodC1();
		Samplee b = new Samplee();
		b.nonStaticMethodC2();
		System.out.println();

	}
}
