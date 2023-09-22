public class Main {
    public Main() {
}
    public static void main(String[] args) {
        PersonalAccount rai = new PersonalAccount(220104075, "Romeo");
        new PersonalAccount(220104073, "Juliette");
        rai.deposit(500.0);
        rai.withdraw(150.0);
        rai.printTransactionHistory();
    }}