package week8;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, bigger;

        System.out.print("첫 번째 숫자: ");
        num1 = sc.nextInt();

        System.out.print("두 번째 숫자: ");
        num2 = sc.nextInt();

        bigger = num1 > num2 ? num1 : num2;
        System.out.println(bigger + "이 더 큽니다.");
    }
}
