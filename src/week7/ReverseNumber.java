package week7;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int seat = 10;

        while(n>0) {
            System.out.print(n%seat);
            n =n/seat;
        }
    }
}
