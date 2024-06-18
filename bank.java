import java.util.Scanner;
public class bank {
    String name;
    int account_number;
    String type;
    int balance=10000;
    int depositAmount;
    int withdrawAmount;

    public static void main(String[] args) {
        bank bank = new bank();
        bank.details();
        bank.withdraw();
        bank.deposit();
        bank.display();
    }

    public bank() {
        this.name = name;
        this.account_number = account_number;
        this.type = type;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    public void details() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        this.name = scanner.nextLine();
        System.out.print("Enter your Account Number : ");
        this.account_number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Account Type(Saving/Current) : ");
        this.type = scanner.nextLine();
        System.out.print("Enter Amount to Deposit : ");
        this.depositAmount = scanner.nextInt();
        System.out.print("Enter Amount to Withdraw : ");
        this.withdrawAmount = scanner.nextInt();
    }

    public void deposit() {
        if (balance > 0) {
            balance = balance + depositAmount;
        }
    }

    public void withdraw() {
        if (balance > 500) {
            balance = balance - withdrawAmount;
        }
    }
    public void display(){
        System.out.println("\n    Account Details  ");
        System.out.println("Account Holder Name : " + name);
        System.out.println("Account Number : " + account_number);
        System.out.println("Account Type : " + type);
        System.out.println("Account Balance : " + balance);
    }
}	