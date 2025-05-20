package week7;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        c = n % 10;
        while (0<c){
            System.out.print(c);
            c--;
        }
    }
}
