package week7;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();

        if (dan >= 2 && dan <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        } else {
            System.out.println("2~9 사이 숫자를 입력하세요.");
        }
    }
}

