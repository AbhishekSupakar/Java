class MobilePhone 
{
	long phoneNumber;
	String ownerName; 
	double balance;
	static boolean Flag;
	public void displayPhoneInfo(){
		System.out.println("Owener name : "+ownerName);
		System.out.println("Phone number : "+phoneNumber);
		System.out.println("Phone Balance : "+balance);
	}
	public static void makeCall(double cost, double balance){
	if(cost <= balance){
		balance = balance - cost;
		Flag = true;
		sendMessage(Flag,cost);
		}
	else{
		System.out.println("Insufficient Balance.");
	}
	}

	public static void recharge(double amt,double balance){
		balance = balance + amt;
		Flag = false;
		sendMessage(Flag,amt);
	}

	public static void sendMessage(boolean Flag,double amt){
      if(Flag==true){
		System.out.println(amt+"has been Deducts the call cost from the balance");
	  }
      else{
		System.out.println(amt+"has been Adds the specified amount to the balance");
		}
	}

	public static void main(String []args) 
	{
		MobilePhone MP1 = new MobilePhone();
		MP1.phoneNumber = 98765432434L;
		MP1.ownerName = "Avisek Suar";
		MP1.balance=234.87;
		MP1.displayPhoneInfo();
		makeCall(12.3,MP1.balance);
		recharge(5,MP1.balance);
	}
}
