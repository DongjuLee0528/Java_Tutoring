package week8;

import java.util.Scanner;

public class DoubleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, doubleNum;

        System.out.print("숫자를 입력하세요: ");
        num = sc.nextInt();

        doubleNum = num * 2;
        System.out.println(num + "의 두 배는 " + doubleNum + "입니다.");
    }
}
