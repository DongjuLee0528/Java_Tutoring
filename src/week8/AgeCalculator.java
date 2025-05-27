package week8;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("태어난 연도를 입력하세요: ");
        int birthYear = scanner.nextInt();

        int currentYear = 2025;
        int age = currentYear - birthYear;

        System.out.println("당신의 나이는 " + age + "세입니다.");

        scanner.close();
    }
}
