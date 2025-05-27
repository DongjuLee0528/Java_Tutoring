package Week8;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        int nowYear = 2025,age=0;
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("태어난 연도를 입력하세요: ");
        year = sc.nextInt();
        while (year < nowYear){
            year++;
            age++;
        }
        System.out.println("당신의 나이는 "+age+"세입니다.");
    }
}
