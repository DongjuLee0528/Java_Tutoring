package week4;

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0 , num2=0 , add = 0, sub = 0, mul = 0, div = 0;
        System.out.print("입력: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        add = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        System.out.println("덧셈: " + add);
        System.out.println("뺄셈: " + sub);
        System.out.println("곱셉: " + mul);
        System.out.println("나눗셈: " + div);
    }
}
