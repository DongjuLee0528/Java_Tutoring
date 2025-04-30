package week4;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.print("입력: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("출력: " + (num1 + num2));
    }
}
