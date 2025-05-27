package week8;

import java.util.Scanner;

public class DoubleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = sc.nextInt();
        int dN = n*2;
        System.out.println(n+"의 두 배는 "+dN+"입니다.");
    }
}
