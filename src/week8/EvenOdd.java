package week8;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 숫자를 입력하시겠습니까? ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(i + "번째 숫자: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + "는 짝수입니다.");
            } else {
                System.out.println(number + "은 홀수입니다.");
            }
        }

        scanner.close();
    }
}
