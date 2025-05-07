package cond.ex;

import java.util.Scanner;

public class ScoreEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수입력: ");
        int score = scanner.nextInt();
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("출력: 학점은 " + grade + "입니다.");
        scanner.close();
    }
}
