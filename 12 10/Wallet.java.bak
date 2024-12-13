import java.util.Scanner;

class  Wallet
{
	private int walletId;
	private String userName;
	private double balance = 0;
	boolean isKYCVerified;
	public Wallet(int walletId,String userName,boolean isKYCVerified){
		this.walletId= walletId;
		this.userName = userName;
		this.isKYCVerified = isKYCVerified;

	}
	public void addFunds(double amount){
		System.out.println("Amount add to your Wallet : "+amount);
		balance+=amount;
		System.out.println("After Amount add to your Wallet your balance is : "+balance);
	}
	public void makePayment(double amount){
		if (balance > amount)
		{
			System.out.println("Amount deduced to your Wallet : "+amount);
			balance-=amount;
			System.out.println("After Amount deduced from your Wallet your balance avaliable now : "+balance);
		}
		else{
			System.out.println("Insufficient Balance:");
		}
	}
	public void displayWalletDetails(){
		System.out.println();
		System.out.println("Wallet ID: "+walletId);
		System.out.println("Wallet User Name: "+userName);
		System.out.println("Wallet Balance Avaliable: "+balance);
		System.out.println("Wallet is KYC Verified: "+isKYCVerified);
		System.out.println();
		
	}
	public static void main(String[] args) 
	{
		Wallet w1 = new Wallet(1234,"Abhishek",true);
		Scanner sc = new Scanner(System.in);
		w1.displayWalletDetails();
		System.out.print("Enetr Amount to add in Wallet : ");
		double amount = sc.nextDouble();
		w1.addFunds(amount);
		w1.displayWalletDetails();
		System.out.print("Enetr Amount to Make Payment in Wallet : ");
		double amountForPay = sc.nextDouble();
		w1.makePayment(amountForPay);
		w1.displayWalletDetails();
	}
}
