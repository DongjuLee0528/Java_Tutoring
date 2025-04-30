package week4;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;
        double avg;

        System.out.print("첫 번째 숫자를 입력하세요: ");
        num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        num2 = scanner.nextInt();

        System.out.print("세 번째 숫자를 입력하세요: ");
        num3 = scanner.nextInt();

        avg = (double)(num1 + num2 + num3) / 3;
        System.out.println("입력한 숫자의 평균: " + avg);
    }
}
