package week4;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cTemp;

        System.out.print("화씨로 변환하고 싶은 섭씨온도를 입력해주세요 : ");
        cTemp = sc.nextDouble();
        System.out.println("화씨로 " + (cTemp * 1.8 +32) + "도 입니다.");
    }
}
