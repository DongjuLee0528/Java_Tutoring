package week4;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0, num2 = 0, num3 = 0, avg = 0;
        System.out.print("첫 번째 숫자를 입력하세요: ");
        num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        num2 = sc.nextInt();

        System.out.print("세 번째 숫자를 입력하세요: ");
        num3 = sc.nextInt();

        avg = (num1 + num2 + num3) / 3;
        System.out.println("입력한 숫자의 평균: " + avg);
    }
}
