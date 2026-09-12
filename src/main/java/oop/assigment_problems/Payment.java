class Payment {
    void pay(double amount) {
        System.out.println("Paid (cash): Rs " + amount);
    }
}

class CardPayment extends Payment {
    void payWithProcessingFee(double amount) {
        double finalAmount = amount + (amount * 0.02);
        System.out.println("Charged (card, incl. fee): Rs " + finalAmount);
    }
}

class PaymentProcessor {
    double totalCollected = 0;

    void processTransaction(Payment payment, double amount) {
        if (payment instanceof CardPayment) {
            CardPayment cardPayment = (CardPayment) payment;
            cardPayment.payWithProcessingFee(amount);
            totalCollected += amount + (amount * 0.02);
        } else {
            payment.pay(amount);
            totalCollected += amount;
        }
    }

    public static void main(String[] args) {
        Payment[] payments = {
            new CardPayment(),
            new Payment(),
            new CardPayment(),
            new CardPayment(),
            new Payment()
        };

        double[] amounts = {100, 50, 20, 75, 120};

        PaymentProcessor processor = new PaymentProcessor();

        for (int i = 0; i < payments.length; i++) {
            processor.processTransaction(payments[i], amounts[i]);
        }

        System.out.println("Total Collected: Rs " + processor.totalCollected);
    }
}
