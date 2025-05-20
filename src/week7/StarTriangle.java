package week7;
import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력: ");
        int base = scanner.nextInt();
        for (int i=1;i<=base;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
