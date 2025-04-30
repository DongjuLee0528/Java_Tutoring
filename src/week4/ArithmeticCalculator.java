package week4;
import java.util.Scanner;
public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("\n출력값");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
