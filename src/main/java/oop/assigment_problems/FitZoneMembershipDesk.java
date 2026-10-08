package oop.assigment_problems;

class Member {
    String name;
    String plan;
    double monthlyFee;

    Member(String name, String plan, double monthlyFee) {
        this.name = name;
        this.plan = plan;
        this.monthlyFee = monthlyFee;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Plan: " + plan);
        System.out.println("Monthly fee: Rs." + monthlyFee);
    }
}

public class FitZoneMembershipDesk {
    public static void main(String[] args) {
        Member m1 = new Member("Ananya", "Gold", 1800);
        Member m2 = new Member("Rahul", "Silver", 1200);

        m1.display();
        System.out.println();
        m2.display();
    }
}
