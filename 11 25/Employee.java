/*
	D.A   -  30% of basic pay
    HRA  -   15% of basic pay
    PF -     12.5% of basic pay.
   Display the Gross pay and Net Pay of each employee after calculating the
   allowances.
   GP = basicPay + DA + HRA;
   NP = GP +- PF;
*/
import java.util.Scanner;
class Employee 
{
	String EmpName,EmpID;
	double basicPay,DA,PF,HRA,GP,NP,Salary;

	public double DearnessAllowence()
	{
		 DA = (basicPay*30)/100;
		return DA;
	}
	public double HouseRentAllowence()
	{
		HRA = (basicPay*15)/100;
		return HRA;
	}
	public double ProvisnalFunds()
	{
		PF = (basicPay*12.5)/100;
		return PF;
	}
	public double GeneralPartnership()
	{
		GP = basicPay + DA + HRA;
		return GP;
	}
	public double NotesPayable()
	{
		NP = GP - PF;
		return NP;
	}
	
	public void Display(){
		System.out.println();
		System.out.println("===========Employee Details===========");
		System.out.println("Employee Name: "+EmpName);
		System.out.println("Employee ID: "+EmpID);
		System.out.println("Employee Basic Pay: "+basicPay);
		System.out.println("Employee Dearness Allowence: "+DA);
		System.out.println("Employee House Rent Allowence: "+HRA);
		System.out.println("Employee Provisnal Funds: "+PF);
		System.out.println("Employee General Partnership: "+GP);
		System.out.println("Employee Notes Payable: "+NP);
	}
	public static void main(String[] args)
		
	{
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		System.out.print("Employee Name: ");
		e1.EmpName = sc.nextLine();
		System.out.print("Employee ID: ");
		e1.EmpID = sc.nextLine();
		System.out.print("Employee Basic Pay: ");
		e1.basicPay = sc.nextDouble();
		e1.DA = e1.DearnessAllowence();
		e1.HRA = e1.HouseRentAllowence();
		e1.PF = e1.ProvisnalFunds();
		e1.GP = e1.GeneralPartnership();
		e1.NP = e1.NotesPayable();
		e1.Display();

		
	}
}
