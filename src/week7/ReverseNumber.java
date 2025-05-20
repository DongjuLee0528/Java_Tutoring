package week7;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("값 입력: ");
        int base=sc.nextInt();

        while(base>0){
            int digit=base%10;
            System.out.print(digit);
            base/=10;
        }
    }
}
