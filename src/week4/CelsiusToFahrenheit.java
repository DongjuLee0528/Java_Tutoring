package week4;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = 0,f = 0;
        System.out.print("입력: ");
        c = sc.nextInt();
        f = (c * 9/5) + 32;
        System.out.println("출력: " + f);

    }
}
