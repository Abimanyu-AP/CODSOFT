import java.util.Scanner;
 class BankAccount{
    private double balance;
    public BankAccount(double intialBalance){
        this.balance= intialBalance;
    }
    public String deposit (double amount) {
        if(amount<=0){
            return "Deposit amount must be positive.";
        }
        balance=balance+amount;
        return "Deposited $"+ amount + ". New balance : $" + balance ;
    }
        public String withdraw(double amount){
            if(amount <=0 ){
                return "withdraw amount must be positive.";
            }
            else if(amount > balance ){
                return "Insufficient balance.";
            }
            balance = balance-amount;
            return "withdraw $"+ amount+". Remaining balance:$"+balance;
        } 
        public String Checkbalance(){
            return "current balance :$"+balance;
        }

    }
    class ATM{
        private BankAccount account;
        private Scanner scanner;
        public ATM (BankAccount account){
            this.account=account;
            this.scanner = new Scanner(System.in);
        }
        public void showMenu(){
            System.out.println("\n---ATM MENU");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit Money");
            System.out.println("3.withdraw Money");
            System.out.println("4.Exit");
        }
        public void run(){
            boolean exit = false;
            while (!exit){
                showMenu();
                System.out.println("choose an option(1_4):");
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                    System.out.println(account.Checkbalance());
                    break;
                    case 2:
                    System.out.println("Enter Deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    System.out.println(account.deposit(depositAmount));
                    break;
                    case 3:
                    System.out.println("Enter withdrawal amount:");
                    double withdrawAmount = scanner.nextDouble();
                    System.out.println(account.withdraw(withdrawAmount));
                    break;
                    case 4:
                    System.out.println("Thank You for using the ATM. Goodbye!");
                    exit = true;
                    break;
                    default:
                    System.out.println("Invalid choice. Please select 1 to 4.");
                }
            }
            scanner.close();
        }

    
}
public class ATMInterface{
    public static void main(String args[]){
        BankAccount userAccount = new BankAccount(1000);
        ATM atm = new ATM (userAccount);
        atm.run();
    }
}

