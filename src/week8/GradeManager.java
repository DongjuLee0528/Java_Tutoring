package week8;

import java.util.Scanner;

public class GradeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, max = 0, min = 0, avgUp = 0;
        float avg = 0;
        int[] grades;

        System.out.print("학생 수를 입력하세요: ");
        num = sc.nextInt();
        grades = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + "번 학생 점수: ");
            grades[i] = sc.nextInt();
        }

        System.out.println("=== 성적 결과 ===");
        min = grades[0];
        for (int i = 0; i < num; i++) {
            avg += grades[i];
            if (max < grades[i]) {
                max = grades[i];
            }
            if (min > grades[i]) {
                min = grades[i];
            }
        }
        avg /= num;
        for (int i = 0; i < num; i++) {
            if (avg <= grades[i]) {
                avgUp++;
            }
        }

        System.out.println("평균 점수: " + avg);
        System.out.println("최고 점수: " + max);
        System.out.println("최저 점수: " + min);
        System.out.println("평균 이상 학생 수: " + avgUp);
    }
}
