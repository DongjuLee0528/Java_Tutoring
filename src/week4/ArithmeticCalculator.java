package week4;

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력: ");
        num1 = sc.nextInt();

        System.out.print("두번째 숫자 입력: ");
        num2 = sc.nextInt();


        System.out.println("덧셈: "+(num1 + num2));
        System.out.println("뺄셈: "+(num1 - num2));
        System.out.println("곱셈: "+(num1 * num2));
        System.out.println("나눗셈: "+(num1 / num2));
    }
}
