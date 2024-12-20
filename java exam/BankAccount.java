/*
Account Holder: Prateek Yadav, Balance: 1000.0

After depositing 500:
Account Holder: Prateek Yadav, Balance: 1500.0

Attempting to withdraw 200:
Withdrawal successful. New balance: 1300.0

Interest accumulated over 6 months: 19.5

displayDetails()
depositAmount()
withdrawAmount()
calculateInterest()
*/

class BankAccount 
{
	String accountHolder;
	double balance ;
	public void displayDetails(){
		System.out.print("Account Holder: "+accountHolder);
		System.out.println(", Balance: "+balance);
	}
	public static double depositAmount(double deposit,double balance){
		System.out.println("After depositing " +deposit+":");
		
		double new1 = balance+deposit;
		return new1;

	}
	public static double withdrawAmount(double withdrawal,double balance){
		System.out.println("Attempting to withdraw " +withdrawal+":");
		double new2;
		if (withdrawal>balance)
		{
			int z=3;
			while (z!=0)
			{
				System.out.println("Attempting to withdraw Failed due to insufficient balance!!!!! " );
				z--;
			}
			return balance; 

		}
		new2 = balance-withdrawal;
		return new2;
		
	}
	public static void calculateInterest(int months,double balance){
		double newbal ;//balance * (interestRate * months).

		newbal = ((double)months *(0.25)* balance)/100;
		System.out.println("Interest accumulated over " +months+" months: "+newbal);
	}
	public static void main(String[] args) 
	{
		BankAccount A1 = new BankAccount();
		A1.accountHolder = "Prateek Yadav";
		A1.balance = 1000.0;
		A1.displayDetails();
		A1.balance = depositAmount(500,A1.balance);
		A1.displayDetails();
		A1.balance = withdrawAmount(200,A1.balance);
		A1.displayDetails();
		calculateInterest(6,A1.balance);

	}
}
