package week7;
import java.util.Scanner;
public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력: ");
        int a = scanner.nextInt();
        if (a%2==0){
            System.out.println("짝수");
        }
        else if (a%2==1){
            System.out.println("홀수");
        }
        else{
            System.out.println("에러");
        }
    }
}
