package week8;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자: ");
        int n1 = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int n2 = sc.nextInt();

        if(n1>n2) {
            System.out.println(n1+"이 더 큽니다.");
        }
        else if(n2>n1) {
            System.out.println(n2+"이 더 큽니다.");
        }
        else {
            System.out.println("두 수는 같습니다.");
        }
    }
}
