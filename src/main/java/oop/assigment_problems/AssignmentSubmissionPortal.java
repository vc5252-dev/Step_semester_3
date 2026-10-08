package oop.assigment_problems;

import java.time.*;

abstract class Assignment {
    String title;
    int maxMarks;
    LocalDate due;

    Assignment(String title, int maxMarks, LocalDate due) {
        this.title = title;
        this.maxMarks = maxMarks;
        this.due = due;
    }

    abstract double penalty(double marks, long daysLate);
}

class CodingAssignment extends Assignment {
    CodingAssignment(String title, int maxMarks, LocalDate due) {
        super(title, maxMarks, due);
    }

    double penalty(double marks, long daysLate) {
        return daysLate <= 0 ? marks : Math.max(0, marks - daysLate * 2);
    }
}

class WrittenAssignment extends Assignment {
    WrittenAssignment(String title, int maxMarks, LocalDate due) {
        super(title, maxMarks, due);
    }

    double penalty(double marks, long daysLate) {
        return daysLate <= 0 ? marks : Math.max(0, marks - daysLate);
    }
}

class Submission {
    String student;
    Assignment assignment;
    LocalDate date;
    boolean graded;

    Submission(String student, Assignment assignment, LocalDate date) {
        this.student = student;
        this.assignment = assignment;
        this.date = date;
        this.graded = false;
    }

    void display() {
        long daysLate = Math.max(0, date.toEpochDay() - assignment.due.toEpochDay());

        System.out.println("Student: " + student);
        System.out.println("Assignment: " + assignment.title);
        System.out.println("Submitted: " + date);
        System.out.println("Days late: " + daysLate);
        System.out.println("Status: " + (graded ? "Graded" : "Pending"));
    }
}

public class AssignmentSubmissionPortal {
    public static void main(String[] args) {
        Assignment coding = new CodingAssignment(
                "Linked List Lab",
                50,
                LocalDate.of(2026, 10, 5)
        );

        Submission submission = new Submission(
                "Vidushi",
                coding,
                LocalDate.of(2026, 10, 7)
        );

        submission.display();

        double finalMarks = coding.penalty(45, 2);
        System.out.println("Final marks after penalty: " + finalMarks);
    }
}
