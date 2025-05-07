package cond.ex;

import java.util.Scanner;

public class DistanceEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("거리입력(KM): ");
        int distance = scanner.nextInt();
        String bbang;

        if (distance <= 1) {
            bbang = "도보";
        } else if (distance <= 10) {
            bbang = "자전거";
        } else if (distance <= 100) {
            bbang = "자동차";
        } else {
            bbang = "비행기";
        }

        System.out.println("출력: " + bbang + "를 이용하세요.");
        scanner.close();
    }
}