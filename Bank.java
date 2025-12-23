public class Bank {

    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        }
    }

    public void checkBalance() {
        System.err.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank account = new Bank(1000);
        account.deposit(500);
        account.withdraw(300);
        account.checkBalance();
    }
}
