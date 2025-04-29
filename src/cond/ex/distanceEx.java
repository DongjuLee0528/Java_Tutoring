package cond.ex;

import java.util.Scanner;

public class distanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("운송 거리를 입력하시오(km단위 ※1km이하면 1km이며 정수만 작성): ");
        int km = sc.nextInt();

        if (km <= 1){
            System.out.println("도보를 이용하세요.");
        }
        else if (km <= 10){
            System.out.println("자전거를 이용하세요.");
        }
        else if (km <= 100){
            System.out.println("자동차를 이용하세요.");
        }
        else {
            System.out.println("비행기를 이용하세요.");
        }
    }
}
