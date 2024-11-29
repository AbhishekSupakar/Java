public class Swapp{
	public static void main(String []args){
		int a = 1;
		int b = 4;
			System.out.println("Value of a : "+a);
				System.out.println("Value of b : "+b);
					System.out.println("After Swap : ");
					System.out.println("-----------------------");
					a=a+b;
					b=a-b;
					a=a-b;
					System.out.println("Value of a : "+a);
				System.out.println("Value of b : "+b);
	}
}
