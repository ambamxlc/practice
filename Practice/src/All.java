public class All {
    public static void main(String[] args) throws Exception {
        BankAccount jimin = new BankAccount("Jimin ", 500);
        jimin.deposit(100);
        jimin.accountDetails();

        BankAccount Namjoon = new BankAccount("Namjoon ", 5_000);
        BankAccount Suga = new BankAccount("Suga ", 300);
        Namjoon.withdrawal(100);
        Suga.deposit(100);
        Namjoon.accountDetails();
        Suga.accountDetails();

        Product btsTix = new Product(3, 23, "BTS tickets ");
        btsTix.printProduct();
        btsTix.totalCost();
    }
}