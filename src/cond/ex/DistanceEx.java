package cond.ex;

import java.util.Scanner;

public class DistanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String transportation = "";
        System.out.print("거리(km) 입력 : ");
        int distance = sc.nextInt();
        sc.close();

        if(distance <= 1) {
            transportation = "도보";
        }
        else if(distance <= 10) {
            transportation = "자전거";
        }
        else if(distance <= 100) {
            transportation = "자동차";
        }
        else {
            transportation = "비행기";
        }

        System.out.println("출력: " + transportation + "를 이용하세요.");
    }
}
