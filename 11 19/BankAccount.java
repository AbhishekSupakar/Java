class BankAccount
{
	String accountNumber,accountHolderName;
	double balance;
	public void displayAccountInfo(){
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Before Operation AC Balance:"+balance);
	}
	public static double newBalanceAfterDeposit(double CurrentBalance,double deposit){
		double newbalanceAfterDeposite=CurrentBalance+deposit;
		System.out.println("After Deposit New Balance is: "+newbalanceAfterDeposite);
		return newbalanceAfterDeposite;
	}
	public static void newBalanceAfterWithdraw(double CurrentBalance,double withdraw){
		if(CurrentBalance>withdraw){
			double newbalanceAfterWithdraw=CurrentBalance-withdraw;
			System.out.println("Sufficient funds are available!!!");
			System.out.println("After Withdraw New Balance is: "+newbalanceAfterWithdraw);
		}
		else{
		System.out.println("Sufficient funds are not available!!!");
		}
	}
	public static void main(String[] args) 
	{	
		double deposit,withdraw;
		BankAccount a1= new BankAccount();
		a1.accountNumber="SBI101020239901";
		a1.accountHolderName="Ariyan Mohanty";
		a1.balance=10109.97;
		deposit=0;
		withdraw=20000;
		a1.displayAccountInfo();
		double result=newBalanceAfterDeposit(a1.balance,deposit);
		newBalanceAfterWithdraw(result,withdraw);
		System.out.println("-------------------------------------------------------");

		BankAccount a2= new BankAccount();
		a2.accountNumber="AXIS907020239901";
		a2.accountHolderName="Anirudh Vatacharaya";
		a2.balance=10109.97;
		deposit=12340;
		withdraw=2000;
		a2.displayAccountInfo();
		result = newBalanceAfterDeposit(a2.balance,deposit);
		newBalanceAfterWithdraw(result,withdraw);
		
	}
}
