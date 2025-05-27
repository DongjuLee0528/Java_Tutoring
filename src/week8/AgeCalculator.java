package week8;

import java.util.Scanner;

public class AgeCalculator {
   public static void main(String[] args) {
       int now_year = 2025;
       Scanner sc = new Scanner(System.in);
       System.out.print("태어난 연도를 입력하세요: ");
       int year = sc.nextInt();
       System.out.println("당신의 나이는 " + (now_year - year)+"세입니다.");
   }
}
