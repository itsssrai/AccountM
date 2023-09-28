public class Amount {
    private double amount;
    private String transactionType;
    public Amount(double theamount, String theTransactionType)
    {
        amount = theamount;
        transactionType = theTransactionType;
    }
    public double getAmount()
    {
        return amount;
    }
    public String getTransactionType()
    {
        return transactionType;
    }
}
