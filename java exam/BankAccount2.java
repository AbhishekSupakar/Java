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

class BankAccount2 
{
	String accountHolder;
	double balance ;
	public void displayDetails(){
		System.out.print("Account Holder: "+accountHolder);
		System.out.println(", Balance: "+balance);
	}
	public void depositAmount(double deposit){
		System.out.println("After depositing " +deposit+":");
		balance+=deposit;
		displayDetails();
		

	}
	public void withdrawAmount(double withdrawal){
		System.out.println("Attempting to withdraw " +withdrawal+":");
		if (withdrawal>balance)
		{
			int z=3;
			while (z!=0)
			{
				System.out.println("Attempting to withdraw Failed due to insufficient balance!!!!! " );
				z--;
			}
		}
		balance-=withdrawal;
		displayDetails();
		
	}
	public  void calculateInterest(int months){
		double newbal ;//balance * (interestRate * months).

		newbal = ((double)months *(0.25)* balance)/100;
		System.out.println("Interest accumulated over " +months+" months: "+newbal);
	}
	public static void main(String[] args) 
	{
		BankAccount2 A1 = new BankAccount2();
		A1.accountHolder = "Prateek Yadav";
		A1.balance = 1000.0;
		A1.displayDetails();
		A1.depositAmount(500);
		A1.withdrawAmount(200);
		A1.calculateInterest(6);

	}
}
