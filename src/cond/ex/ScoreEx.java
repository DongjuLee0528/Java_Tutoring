package cond.ex;

import java.util.Scanner;

public class ScoreEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.print("score: ");
        score = sc.nextInt();

        System.out.print("출력: 학점은 ");
        if (score >= 90) {
            System.out.print("A");
        }
        else if (score >= 80) {
            System.out.print("B");
        }
        else if (score >= 70) {
            System.out.print("C");
        }
        else if (score >= 60) {
            System.out.print("D");
        }
        else {
            System.out.print("F");
        }

        System.out.println("입니다.");
    }
}
