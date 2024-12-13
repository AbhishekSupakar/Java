import java.util.Scanner;
class UPI{
 String upiId;
}
class Cash{
 int amt;
}
class Cheque{
 String micr;
}
class Card{
 long cardNumber;
 int cvv;
}
class Payment{
public static void pay(UPI u,User b){
    //provide logic to verify the mobile no is valid or not

System.out.println("=======Make payment using UPI=========");
Scanner sc = new Scanner(System.in);
 String str = u.upiId.replace("@ybl", "");
 long id = Long.parseLong(str);
 int count=0;
 do
 {
	id/=10;
	count++;
 }
 while (id!=0);
 if (count==10)
 {
	System.out.println("You can make payment.");
	System.out.print("Enter Amount to send: ");
	long Amt = sc.nextLong();
	if (Amt>b.Balance)
	{
		System.out.println("Your Account Balance is insufficient.");
	}
	else{
		b.Balance = b.Balance-Amt;
		System.out.println("Your Account Balance is now: "+b.Balance);
	}
 }
 else{
	System.out.println("Wrong Upi id!!!\nyou cannot make payment.");
 }

}



public static void pay(Cash u){
    //verify cash amount should be ending with 0
	

System.out.println("==============Make payment using Cash==============");

int check = u.amt%10;
if (check==0)
{
	System.out.println("You can give cash : "+u.amt);
}
else
{
	System.out.println("Invalid cash Amount. You cannot give cash.");
}
}



public static void pay(Cheque u,User b){
    //verify micr starts with "BNK"
System.out.println("===============Make payment using Cheque================");
Scanner sc = new Scanner(System.in);
boolean check = u.micr.startsWith("BNK");
if (check)
{
	System.out.println("You can make payment through Cheque : "+u.micr);
	System.out.println("You can make payment.");
	System.out.print("Enter Amount to send: ");
	long Amt = sc.nextLong();
	if (Amt>b.Balance)
	{
		System.out.println("Your Account Balance is insufficient.");
	}
	else{
		b.Balance = b.Balance-Amt;
		System.out.println("Your Account Balance is now: "+b.Balance);
	}
}
else
{
	System.out.println("Invalid MICR Code. You cannot make payment through Cheque.");
}
}



public static void pay(Card u,User b){
    //verify card by taking cvv within 100 t0 999
	System.out.println("================Make payment using Card==========");
	Scanner sc = new Scanner(System.in);

int count=0;
do
 {
	u.cardNumber/=10;
	count++;
 }
 while (u.cardNumber!=0);
 if (count==16)
 {
	 int count2=0;
	 do
 {
	u.cvv/=10;
	count2++;
 }
 while (u.cvv!=0);
if (count2==3)
{
	System.out.println("You can make payment.");
	System.out.print("Enter Amount to send: ");
	long Amt = sc.nextLong();
	if (Amt>b.Balance)
	{
		System.out.println("Your Account Balance is insufficient.");
	}
	else{
		b.Balance = b.Balance-Amt;
		System.out.println("Your Account Balance is now: "+b.Balance);
	}
}
else
{
	System.out.println("Wrong CVV Number!!!\nyou cannot make payment.");
}

 }
 else
{
	System.out.println("Wrong Card number!!!\nyou cannot make payment.");
}
 

}
}



class User{
	double Balance;
public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	User uSER1 = new User();
	uSER1.Balance = 392.41;

UPI u1UPI = new UPI();
System.out.print("Enter your Upi id:");
u1UPI.upiId= sc.nextLine();
Payment.pay(u1UPI,uSER1);


Cash u1ch = new Cash();
System.out.print("Enter your Amt: ");
u1ch.amt= sc.nextInt();
Payment.pay(u1ch);

Cheque u1cq = new Cheque();
System.out.print("Enter your Cheque MICR :");
u1cq.micr = sc.nextLine();
Payment.pay(u1cq,uSER1);



Card u1cd = new Card();
System.out.print("Enter your Card number :");
u1cd.cardNumber = sc.nextLong();
System.out.print("Enter your Card CVV number :");
u1cd.cvv = sc.nextInt();
Payment.pay(u1cd,uSER1);

}
}