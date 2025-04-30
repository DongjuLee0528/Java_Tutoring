package week4;
import java.util.Scanner;
public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력: ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int sum=a+b;
        System.out.println("출력: "+sum);
    }
}

