class MessWallet {
    private double balance;

    MessWallet(double balance) {
        if (balance < 0) {
            System.out.println("Warning: opening balance cannot be negative. Starting at 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    void topUp(double amount) {
        if (amount <= 0)
            System.out.println("Top-up rejected: amount must be greater than 0.");
        else {
            balance += amount;
            System.out.printf("Balance after top-up: %.1f%n", balance);
        }
    }

    void deduct(double amount) {
        if (amount > balance)
            System.out.println("Deduct rejected: insufficient balance");
        else if (amount <= 0)
            System.out.println("Deduct rejected: amount must be greater than 0.");
        else
            balance -= amount;
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(500);
        wallet.topUp(200);
        wallet.deduct(1000);
        System.out.printf("Final balance: %.1f%n", wallet.getBalance());
    }
}
