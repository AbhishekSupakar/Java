import java.util.Scanner;

class BankingSystem {
    double balance;

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + balance + ".");
        } else {
            System.out.println("Insufficient balance. Withdrawal denied.");
        }
    }

    public void withdraw(String chequeNumber, double amount) {
        if (chequeNumber.startsWith("CHK")) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Cheque withdrawal with cheque number " + chequeNumber + " processed successfully.");
                System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + balance + ".");
            } else {
                System.out.println("Insufficient balance. Withdrawal denied.");
            }
        } else {
            System.out.println("Invalid cheque number. Withdrawal denied.");
        }
    }

    public void withdraw(long atmNumber, double amount) {
        String atmNumberStr = String.valueOf(atmNumber);
        if (atmNumberStr.length() == 16) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("ATM card withdrawal processed successfully.");
                System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + balance + ".");
            } else {
                System.out.println("Insufficient balance. Withdrawal denied.");
            }
        } else {
            System.out.println("Invalid card number. Withdrawal denied.");
        }
    }

    public static void Display() {
        System.out.println("Choose withdrawal method:\n1. Cash Withdrawal\n2. Cheque Withdrawal\n3. ATM Card Withdrawal");
    }

    public boolean CheckSwitchWithdraw() {
        Scanner sc = new Scanner(System.in);
        Display();
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount to withdraw: ");
                double cashAmount = sc.nextDouble();
                withdraw(cashAmount);
                break;

            case 2:
                System.out.print("Enter cheque number: ");
                String chequeNumber = sc.next();
                System.out.print("Enter amount to withdraw: ");
                double chequeAmount = sc.nextDouble();
                withdraw(chequeNumber, chequeAmount);
                break;

            case 3:
                System.out.print("Enter card number: ");
                long atmNumber = sc.nextLong();
                System.out.print("Enter amount to withdraw: ");
                double atmAmount = sc.nextDouble();
                withdraw(atmNumber, atmAmount);
                break;

            default:
                System.out.println("Invalid choice.");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingSystem b1 = new BankingSystem();
        System.out.print("Enter initial balance: ");
        b1.balance = sc.nextDouble();
        b1.CheckSwitchWithdraw();
    }
}
