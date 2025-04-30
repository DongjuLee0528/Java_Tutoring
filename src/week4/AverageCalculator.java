package week4;

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 수: ");
        int fst = scanner.nextInt();
        scanner.nextLine();

        System.out.print("두번째 수: ");
        int sec = scanner.nextInt();
        scanner.nextLine();

        System.out.print("세번째 수: ");
        int trd = scanner.nextInt();
        scanner.nextLine();

        double avg = (fst + sec + trd) / 3;
        System.out.println("입력한 숫자의 평균 : " + avg);


    }
}
