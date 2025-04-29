package Week2;


import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Age;
        String Name,Color;

        System.out.print("이름을 입력하세요: " );
        Name = scanner.nextLine();

        System.out.print("나이를 입력하세요: " );
        Age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("좋아하는 색깔을 입력하세요: " );
        Color = scanner.nextLine();

        System.out.println("\n출력 결과");
        System.out.println("안녕하세요!" + Name + "님," + Age + "살이시군요." + "좋아하는 색깔은 " + Color + "이네요!");
    }
}


