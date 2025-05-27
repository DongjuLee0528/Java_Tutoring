package Week8;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int [] nums;
        int number,num,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 숫자를 입력하시겠습니까? ");
        number = sc.nextInt();
        nums = new int[number];
        for (i = 0; i < number; i++){
            System.out.print(i+1+"번째 숫자: ");
            num = sc.nextInt();
            nums[i] = num;
        }
        for (i = 0; i < number; i++){
            if (nums[i] % 2 == 0){
                System.out.println(nums[i]+"는 짝수 입니다.");
            }
            else{
                System.out.println(nums[i]+"는 홀수 입니다.");
            }

        }
    }
}
