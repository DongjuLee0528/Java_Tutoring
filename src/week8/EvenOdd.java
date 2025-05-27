package week8;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개 숫자를 입력하시겠습니까? ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++) {
            System.out.print((i+1)+"번째 숫자: ");
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++) {
            if(arr[i]%2==0) {
                System.out.println(arr[i]+"은 짝수입니다.");
            }
            else {
                System.out.println(arr[i]+"은 홀수입니다.");
            }
        }
    }
}
