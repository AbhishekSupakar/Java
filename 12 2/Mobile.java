/*
Case 1: Successful Unlock and Messaging

Enter mobile Pattern : 
Star
Enter mobile Biometric Id: 
9876543210
Enter mobile PIN: 
4321

Choose unlock type:
1. Pattern
2. PIN
3. Biometric ID
Enter your choice : 2
Enter PIN:
4321
Phone unlocked with PIN.

Choose message type:
1. Contact Name
2. Phone Number
Enter your choice : 
1

Enter contact name:
John
Messaging to contact: John
*/


import java.util.Scanner;

class Mobile
{
	String pattern;
	int pin;
	long BioID;
	boolean check;
	
	public boolean unlock(String text)
	{
		int z = text.compareTo(pattern);
		if (z==0)
		{
			System.out.println("Phone unlocked with PIN.");
			return true;
		}
		return false;
	}
	public boolean unlock(long id)
	{
		if (id==BioID)
		{
			System.out.println("Phone unlocked with PIN.");
			return true;
		}
		return false;
	}
	public boolean unlock(int mobPin)
	{
		
		if (mobPin==pin)
		{
			System.out.println("Phone unlocked with PIN.");
			return true;
		}
		return false;
	}
	public void msg(String contactName)
	{
		if (check)
		{
			System.out.println("Messaging to contact:" +contactName);
		}
		else
		{
			System.out.println("Phone is locked. Cannot send a message.");
		}
		
	}
	public void msg(long phoneNumber)
	{
		if (check)
		{
			System.out.println("Messaging to contact:"+phoneNumber);
		}
		else
		{
			System.out.println("Phone is locked. Cannot send a message.");
		}
	}
	public static void Display()
	{
		System.out.println("Choose unlock type:\n1. Pattern\n2. PIN\n3. Biometric ID");
	}
	public static void Display2()
	{
		System.out.println("Choose message type:\n1. Contact Name\n2. Phone Number");	
	}
	public boolean CheckSwitchPin()
	{
		Scanner sc = new Scanner(System.in);
		Display();
		System.out.print("Choose a option for unlock: ");
		int checku = sc.nextInt();
		switch (checku)
		{
		case 2: System.out.print("Enter Pin:");int mobPin = sc.nextInt(); check = unlock(mobPin);break;
		case 1: System.out.print("Enter Pattern:");String Patt = sc.next(); check = unlock(Patt);break;
		case 3: System.out.print("Enter Biometric Id:");long ch = sc.nextLong();check = unlock(ch);break;
		default: System.out.println("Wrong Choice!!");
		}
		return check;
	}
	public void checkSwitchMsg()
	{
		Scanner sc = new Scanner(System.in);
		Display2();
		System.out.print("Choose a option for message: ");
		int check2 = sc.nextInt();
		switch (check2)
		{
		case 1:System.out.print("Enter Contact Name: "); sc.nextLine();String coname= sc.nextLine();msg(coname);break;
		case 2:System.out.print("Enter Contact Phone number: "); long cophno= sc.nextLong();msg(cophno);break;
		default:System.out.println("Wrong Choice!!");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Mobile m1 = new Mobile();
		System.out.print("Enter mobile Pattern :");
		m1.pattern = sc.next();
		System.out.print("Enter mobile Biometric Id: ");
		m1.BioID = sc.nextLong();
		System.out.print("Enter mobile PIN: ");
		m1.pin = sc.nextInt();
		m1.CheckSwitchPin();
		m1.checkSwitchMsg();	
	}
}
