package week8;

import java.util.Scanner;

public class DoubleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();

        int result = number * 2;
        System.out.println(number + "의 두 배는 " + result + "입니다.");

        scanner.close();
    }
}
