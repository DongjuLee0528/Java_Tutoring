package week2;

import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // 스킵방지

        System.out.print("좋아하는 색깔을 입력하세요: ");
        String favoriteColor = scanner.nextLine();

        System.out.println("\n[출력 결과]");
        System.out.println("안녕하세요! " + name + "님, " + age + "살이시군요. 좋아하는 색깔은 " + favoriteColor + "이네요!");
    }
}
