package week7;
import java.util.Scanner;
public class Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("단 입력: ");
        int base = scanner.nextInt();
        int result;
        if (base<=9) {
            for (int i = 1; i<=9; i++) {
                result = base * i;
                System.out.println(base + "*" + i + "=" + result);
            }
        }
    }
}
