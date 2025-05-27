package week8;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentYear = 2025, birthYear, age;

        System.out.print("태어난 연도를 입력하세요: ");
        birthYear = sc.nextInt();

        age = currentYear - birthYear;
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
