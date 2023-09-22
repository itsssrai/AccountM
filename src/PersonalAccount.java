import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;
    public PersonalAccount(int accNumb, String accHolder) {
        this.accountNumber = accNumb;
        this.accountHolder = accHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList();    }
    public void deposit(double amount) {
        if (amount > 0.0) {
            this.transactions.add(new Amount(amount, "Deposit"));
            this.balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Error!Your deposit should be greater than 0.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0.0 && amount <= this.balance) {
            this.transactions.add(new Amount(amount, "Withdrawal"));
            this.balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Error!Invalid withdrawal.");
        }
    }
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account #" + this.accountNumber + " (" + this.accountHolder + "):");
        Iterator var1 = this.transactions.iterator();
        while(var1.hasNext()) {
            Amount transaction = (Amount)var1.next();
            PrintStream var10000 = System.out;
            String var10001 = transaction.getTransactionType();
            var10000.println(var10001 + ": $" + transaction.getAmount());        }
    }
    public double getBalance() {
        return this.balance;    }
    public int getAccountNumber() {
        return this.accountNumber;    }
    public String getAccountHolder() {
        return this.accountHolder;    }
}
