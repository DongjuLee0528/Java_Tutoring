package week7;

import java.util.Scanner;

public class SumUpToN {
    public static void main(String[] args) {
        int sum = 0, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("합계: "+sum);
    }
}
