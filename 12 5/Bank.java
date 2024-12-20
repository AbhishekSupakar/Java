import java.util.Scanner;
class Bank 
{
	static String bankName ;
	static String ifsc ;
	String accountHolderName;
	long accountNumber;
	double balance;
	public static void setBankName(String bankName){
		Bank.bankName= bankName;
	}
	public static void setIfsc(String ifsc){
		Bank.ifsc= ifsc;
	}
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}
	public void setAccountNumber(long accountNumber){
		long check = accountNumber;
		int count = 0;
		do
		{
			check/=10;
			count++;
		}
		while (check!=0);
		if (count==10)
		{
			this.accountNumber = accountNumber;
		}
		else{
		System.out.println("Invalid Account Number!!!");}
	}
	public void setBalance(double balance){
		if (balance>0)
		{
			this.balance = balance;
		}
		else{
			System.out.println("Invalid Amount Enter Zero and negative not allowed!!!");
		}
	}
	public static String getBankName(){
		return bankName;
	}
	public static String getIfsc(){
		return ifsc;
	}
	public String getAccountHolderName(){
		return accountHolderName;
	}
	public long getAccountNumber(){
		return accountNumber;
	}
	public double getBalance(){
		return balance;
	}
	public void display(){
		System.out.println("=========Bank Details=========");
		System.out.println("Bank Name: "+bankName);
		System.out.println("IFSC Code of the Bank: "+ifsc);
		System.out.println("Account Holder's Name: "+accountHolderName);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account balance avaliable: "+balance);
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Bank a1 = new Bank();
		Scanner sc = new Scanner(System.in);
		setBankName("SBI");
		setIfsc("SBIN0013270");
		a1.setAccountHolderName("Abhishek Supakar");
		a1.setAccountNumber(1234567890L);
		a1.setBalance(35000);
		bankName = getBankName();
		ifsc = getIfsc();
		a1.accountHolderName = a1.getAccountHolderName();
		a1.accountNumber = a1.getAccountNumber();
		a1.balance = a1.getBalance();
		a1.display();
	}
}
