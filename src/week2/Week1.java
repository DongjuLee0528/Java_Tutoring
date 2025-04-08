package week2;

import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("이름을 입력하세요: ");
        String str = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("좋아하는 색깔을 입력하세요: ");
        String strColor = scanner.nextLine();


        System.out.print("안녕하세요!" + str +"님,"+age+"살이시군요.좋아하는 색깔은"+strColor+"이네요!\n");
    }
}