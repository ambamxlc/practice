public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String custName, int acctBal) {
        this.name = custName;
        this.balance = acctBal;
    }

    public void deposit(double depAmnt) {
        balance += depAmnt;
    }

    public void withdrawal(double wdAmount) {
        balance -= wdAmount;
    }

    public void accountDetails() {
        System.out.println(name + "'s account contains $" + balance);
    }
}