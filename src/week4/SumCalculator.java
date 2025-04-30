package week4;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0,sum = 0;
        System.out.print("입력: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("출력: " + sum);
    }
}
