package cond.ex;

import java.util.Scanner;

public class DistanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distance = 0;
        String vehicle;

        System.out.print("distance: ");
        distance = sc.nextInt();

        if (distance <= 1) {
            vehicle = "도보";
        }
        else if (distance <= 10) {
            vehicle = "자전거";
        }
        else if (distance <= 100) {
            vehicle = "자동차";
        }
        else {
            vehicle = "비행기";
        }
        System.out.println("출력: " + vehicle + "를 이용하세요.");
    }
}
