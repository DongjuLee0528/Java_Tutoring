package week4;

import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 수: ");
        int fst = scanner.nextInt();
        scanner.nextLine();

        System.out.print("두번째 수: ");
        int sec = scanner.nextInt();
        scanner.nextLine();


        System.out.println("덧셈 : " + (fst + sec));
        System.out.println("뺄셈 : " + (fst - sec));
        System.out.println("곱셈 : " + (fst * sec));
        System.out.println("나눗셈 : " + (fst / sec));
    }
}
