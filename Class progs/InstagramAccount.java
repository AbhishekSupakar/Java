class InstagramAccount {
	static String type ="Public";
	String userid;
	String password;
	public static void main(String[] args) 
	{
		InstagramAccount a1= newInstagramAccount();
		a1.userid="Abhishek@123";
		a1.password="ASWQE123";
		System.out.println("Account name"+a1.userid);
		System.out.println("Account"+a1.password);
		System.out.println("Account type"+type);
	}
}
