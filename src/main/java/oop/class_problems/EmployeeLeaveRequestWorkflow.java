package oop.class_problems;

class LeaveRequest {
    String employeeName;
    int days;
    String status;

    LeaveRequest(String employeeName, int days) {
        this.employeeName = employeeName;
        this.days = days;
        this.status = "Pending";
    }

    void review(boolean approved) {
        status = approved ? "Approved" : "Rejected";
    }

    void display() {
        System.out.println("Employee: " + employeeName);
        System.out.println("Leave days: " + days);
        System.out.println("Status: " + status);
    }
}

public class EmployeeLeaveRequestWorkflow {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("Rahul", 3);

        request.display();
        request.review(true);

        System.out.println("\nAfter review:");
        request.display();
    }
}
