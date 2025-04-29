package cond.ex;

import java.util.Scanner;

public class scoreEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하시오.");
        int score = scanner.nextInt();

        if (score >= 90){
            System.out.println("학점은 A 입니다.");
        }
        else if (score >= 80){
            System.out.println("학점은 B 입니다.");
        }
        else if (score >= 70){
            System.out.println("학점은 C 입니다.");
        }
        else if (score >= 60){
            System.out.println("학점은 D 입니다.");
        }
        else {
            System.out.println("학점은 F 입니다.");
        }
    }
}
