class Account 
{
	String accHolderName;
	double accBalance;
	long accNumber;
	Account (String accHolderName,double accBalance,long accNumber){
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
		this.accNumber = accNumber;
	}
	public void deposite(double amt){
		accBalance+=amt;
	}
	public void withdraw(double amt){
		accBalance -=amt;
	}
	public void Display(){
		System.out.println("Account Holder Name:" +accHolderName);
		System.out.println("Account Number:" +accNumber);
		System.out.println("Account balance: " +accBalance);
		
	}

	public static void main(String[] args) 
	{
		Account a1 = new Account("Abhishek",1234.89,12345678987L);
		a1.Display();
		a1.deposite(100);
		a1.Display();
		a1.withdraw(100);
		a1.Display();
	}
}
