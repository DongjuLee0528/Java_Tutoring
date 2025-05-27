package Week8;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자: ");
        num1 = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1+"이 더 큽니다.");
        }
         else{
            System.out.println(num2+"이 더 큽니다.");
        }
    }
}
