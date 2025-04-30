package week4;

import java.util.Scanner;

public class SumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 수: ");
        int fst = scanner.nextInt();
        scanner.nextLine();

        System.out.print("두번째 수: ");
        int sec = scanner.nextInt();
        scanner.nextLine();

        System.out.print("두수의 합 : " + (fst + sec));

    }
}