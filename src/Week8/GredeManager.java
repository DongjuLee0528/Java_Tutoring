package Week8;

import java.util.Scanner;

public class GredeManager {
    public static void main(String[] args) {
        int[] scores;

        int i,student,score,min=999,max=0,count=0;
        double avg=0;
        Scanner sc =  new Scanner(System.in);
        System.out.print("학생 수를 입력해 주세요: ");
        student = sc.nextInt();
        scores = new int[student];
        for (i = 0; i < student; i++) {
            System.out.print(i+1 + "번 학생의 점수: ");
            score = sc.nextInt();

            scores[i] = score;
            avg += score;
            if (max < score){
                max = score;
            }
            if (min > score){
                min = score;
            }
        }
        avg /= student;
        for (i = 0; i < student; i++) {
            if (avg < scores[i]){
                count++;
            }
        }
        System.out.println("== 성적 결과 ==");
        System.out.println("평균 점수: " + avg);
        System.out.println("최고 점수: " + max);
        System.out.println("최저 점수: " + min);
        System.out.println("평균 이상의 학생수: " +count+"명");

    }

}
//학생수 변수, for,