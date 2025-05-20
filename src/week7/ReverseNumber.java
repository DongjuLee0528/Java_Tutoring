package week7;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int newNum = 0;

        while (n != 0) {
            newNum *= 10;
            newNum += (n % 10);
            n /= 10;
        }

        System.out.println(newNum);
    }
}
