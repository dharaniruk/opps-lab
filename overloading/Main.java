class Bank {
    void deposit(int cash) {
        System.out.println("Cash Deposit: " + cash);
    }

    void deposit(String cheque, int amount) {
        System.out.println("Cheque Deposit: " + amount);
    }

    void deposit(double onlineAmount) {
        System.out.println("Online Transfer: " + onlineAmount);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(5000);
        b.deposit("Cheque", 10000);
        b.deposit(2500.75);
    }
}