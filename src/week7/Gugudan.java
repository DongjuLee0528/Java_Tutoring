package week7;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        int n, sum;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i < 10; i++){
            sum = n * i;
            System.out.println(n + " * " + i + " = " + sum);
        }
    }
}
