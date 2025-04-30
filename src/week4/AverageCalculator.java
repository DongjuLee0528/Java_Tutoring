package week4;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        double num1, num2, num3;

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        num1 = sc.nextDouble();

        System.out.print("첫번째 숫자를 입력하세요: ");
        num2 = sc.nextDouble();

        System.out.print("첫번째 숫자를 입력하세요: ");
        num3 = sc.nextDouble();

        System.out.println("입력한 숫자의 평균: " + (num1+num2+num3)/3);
    }
}
