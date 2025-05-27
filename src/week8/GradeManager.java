package week8;

import java.util.Scanner;

public class GradeManager {
    public static void main(String[] args) {
        System.out.print("학생 수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int min = 30000;
        double avg = 0;
        int[] arr = new int[n];
        for(int i =0;i<n;i++) {
            System.out.print((i+1) + "번 학생 점수 :" );
            arr[i] = sc.nextInt();
            avg += arr[i];
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }
        avg = avg/n;
        int avg_num = 0;
        for(int i =0;i<n;i++) {
            if(arr[i]>avg) avg_num++;
        }
        System.out.println("=== 성적 결과 ===");
        System.out.println("평균 점수: " + avg);
        System.out.println("최고 점수:" + max);
        System.out.println("최저 점수: " + min);
        System.out.println("평균 이상 학생 수: " + avg_num +"명");
    }
}
