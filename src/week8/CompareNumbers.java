package week8;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + "이 더 큽니다.");
        } else if (num2 > num1) {
            System.out.println(num2 + "이 더 큽니다.");
        } else {
            System.out.println("두 숫자는 같습니다.");
        }

        scanner.close();
    }
}
