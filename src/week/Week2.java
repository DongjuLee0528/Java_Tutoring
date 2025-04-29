package week;

import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요:");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("좋아하는 색깔을 입력하세요:");
        String color = scanner.nextLine();

        System.out.println("안녕하세요!" + name +"님," + age + "살이시군요. 좋아하는 색깔은 " + color +"이네요!");
    }
}
