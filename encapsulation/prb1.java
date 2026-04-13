class Bank {
    private int balance = 1000;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(500);
        b.withdraw(200);
        b.display();
    }
}
