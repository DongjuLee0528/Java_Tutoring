package cond.ex;

import java.util.Scanner;

public class DistanceEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("distance: ");
        int distance = scanner.nextInt();
        String transport;

        if (distance <= 1) {
            transport = "도보";
        } else if (distance <= 10) {
            transport = "자전거";
        } else if (distance <= 100) {
            transport = "자동차";
        } else {
            transport = "비행기";
        }

        System.out.println("출력: " + transport + "를 이용하세요.");
        scanner.close();
    }
}