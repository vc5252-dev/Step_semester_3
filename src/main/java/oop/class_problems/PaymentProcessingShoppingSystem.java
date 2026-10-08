package oop.class_problems;

interface Payment {
    void pay(double amount);
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Card.");
    }
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
}

class CashPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Cash.");
    }
}

public class PaymentProcessingShoppingSystem {
    public static void main(String[] args) {
        Payment p1 = new CardPayment();
        Payment p2 = new UpiPayment();
        Payment p3 = new CashPayment();

        p1.pay(1500);
        p2.pay(850);
        p3.pay(500);
    }
}
