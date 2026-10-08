package oop.class_problems;

abstract class Question {
    String text;
    String answer;

    Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    abstract boolean checkAnswer(String userAnswer);
}

class MCQQuestion extends Question {
    MCQQuestion(String text, String answer) {
        super(text, answer);
    }

    boolean checkAnswer(String userAnswer) {
        return answer.equalsIgnoreCase(userAnswer);
    }
}

class TrueFalseQuestion extends Question {
    TrueFalseQuestion(String text, String answer) {
        super(text, answer);
    }

    boolean checkAnswer(String userAnswer) {
        return answer.equalsIgnoreCase(userAnswer);
    }
}

public class OnlineExaminationSystem {
    public static void main(String[] args) {
        Question q1 = new MCQQuestion(
                "Which language is used for Android development?",
                "Java"
        );

        Question q2 = new TrueFalseQuestion(
                "Java supports object-oriented programming.",
                "true"
        );

        System.out.println("Q1 correct: " + q1.checkAnswer("Java"));
        System.out.println("Q2 correct: " + q2.checkAnswer("true"));
    }
}
