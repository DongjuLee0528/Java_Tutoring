package week7;
import java.util.Scanner;
public class SumUpToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력: ");
        int base = scanner.nextInt();
        int result=0;
        for (int i=1;i<=base;i++) {
            result = result + i;
        }
        System.out.println(result);
    }
}
