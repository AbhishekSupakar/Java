class ArithmeticOperations{
	public static void main(String []args){
		int a=10,b=5,add,mul,div,sub,mod;
		float c=10.2f,d=1.4f,add1,mul1,div1,sub1,mod1;
		double e=1.5,f=1.0,add2,mul2,div2,sub2,mod2;
		add=a+b;mul=a*b;div=a/b;sub=a-b;mod=a%b;
		System.out.println("Integer Operration: addition="+add+ "subtraction="+sub+ "multiplication="+mul+ "division="+div+"modulus="+mod);
		add1=c+b;mul1=c*d;div1=c/d;sub1=c-d;mod1=c%d;
		System.out.println("Float Operration: addition="+add1+ "subtraction="+sub1+ "multiplication="+mul1+ "division="+div1+"modulus="+mod1);
		add2=e+f;mul2=e*f;div2=e/f;sub2=e-f;mod2=e%d;
		System.out.println("Double Operration: addition="+add2+ "subtraction="+sub2+ "multiplication="+mul2+ "division="+div2+"modulus="+mod2);
	}
}