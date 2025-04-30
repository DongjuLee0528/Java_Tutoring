package week4;

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.print("입력: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("출력:");
        System.out.println("덧셈: " + (num1 + num2));
        System.out.println("뺄셈: " + (num1 - num2));
        System.out.println("곱셈: " + (num1 * num2));
        if (num2 != 0)
            System.out.println("나눗셈: " + (num1 / num2));
    }
}
