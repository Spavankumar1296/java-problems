import java.util.Scanner;
class RBI {
    protected double interestRate = 4.0;
    public double getInterestRate() {
        return interestRate;
    }
}
class SBI extends RBI { 
    public double getInterestRate() {
        return 5.0;
    }
}
class ICICI extends RBI {

    public double getInterestRate() {
        return 6.0;
    }
}

class PNB extends RBI {

    public double getInterestRate() {
        return 4.5;
    }
}

class Customer {
    private String name;
    public Customer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Account {
    private Customer customer;
    private RBI bank;
    public Account(Customer customer, RBI bank) {
        this.customer = customer;
        this.bank = bank;
    }

    public void displayInterestRate() {
        System.out.println(customer.getName() + "'s Bank: " + bank.getClass().getSimpleName());
        System.out.println("Interest Rate: " + bank.getInterestRate() + "%\n");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Alice");
        RBI rbi = new RBI();
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        PNB pnb = new PNB();
        Account account1 = new Account(customer1, rbi);
        Account account2 = new Account(customer2, sbi);
        account1.displayInterestRate();
        account2.displayInterestRate();

        System.out.print("Enter the Bank name to find the rate of Interest: ");
        String bankName = scanner.nextLine().toUpperCase();
        switch (bankName) {
            case "RBI":
                Account accountRBI = new Account(customer1, rbi);
                accountRBI.displayInterestRate();
                break;
            case "SBI":
                Account accountSBI = new Account(customer1, sbi);
                accountSBI.displayInterestRate();
                break;
            case "ICICI":
                Account accountICICI = new Account(customer1, icici);
                accountICICI.displayInterestRate();
                break;
            case "PNB":
                Account accountPNB = new Account(customer1, pnb);
                accountPNB.displayInterestRate();
                break;
            default:
                System.out.println("Invalid bank name.");
        }
        scanner.close();
    }
}
