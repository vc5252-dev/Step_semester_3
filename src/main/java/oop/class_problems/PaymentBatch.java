class FeeAccount {
    double balance;

    FeeAccount(double balance) {
        this.balance = balance;
    }
}

class HostelFeeAccount extends FeeAccount {
    HostelFeeAccount(double balance) {
        super(balance);
    }
}

class PaymentBatch {
    void processPayment(FeeAccount account, double amount) {
        if (account instanceof HostelFeeAccount) {
            System.out.println("Paid in two installments (hostel account)");
        } else {
            System.out.println("Paid in one go (day-scholar account)");
        }
    }

    public static void main(String[] args) {
        FeeAccount[] accounts = {
            new HostelFeeAccount(0),
            new HostelFeeAccount(0),
            new FeeAccount(0),
            new FeeAccount(0)
        };

        int hostelCount = 0;
        int dayScholarCount = 0;

        PaymentBatch batch = new PaymentBatch();

        for (FeeAccount account : accounts) {
            batch.processPayment(account, 60000);

            if (account instanceof HostelFeeAccount) {
                hostelCount++;
            } else {
                dayScholarCount++;
            }
        }

        System.out.println("Hostel accounts processed: " + hostelCount +
                " | Day-scholar accounts processed: " + dayScholarCount);
    }
}
