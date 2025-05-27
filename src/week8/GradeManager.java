package week8;

import java.util.Scanner;

public class GradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int studentCount = scanner.nextInt();

        int[] scores = new int[studentCount];
        int sum = 0;

        // 점수 입력
        for (int i = 0; i < studentCount; i++) {
            System.out.print((i + 1) + "번 학생 점수: ");
            scores[i] = scanner.nextInt();
            sum += scores[i];
        }

        // 평균 계산
        double average = (double) sum / studentCount;

        // 최고점, 최저점 찾기
        int max = scores[0];
        int min = scores[0];

        for (int i = 1; i < studentCount; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        // 평균 이상 학생 수 계산
        int aboveAverage = 0;
        for (int i = 0; i < studentCount; i++) {
            if (scores[i] >= average) {
                aboveAverage++;
            }
        }

        // 결과 출력
        System.out.println("=== 성적 결과 ===");
        System.out.println("평균 점수: " + average);
        System.out.println("최고 점수: " + max);
        System.out.println("최저 점수: " + min);
        System.out.println("평균 이상 학생 수: " + aboveAverage + "명");

        scanner.close();
    }
}
