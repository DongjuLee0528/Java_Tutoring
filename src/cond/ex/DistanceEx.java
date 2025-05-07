package cond.ex;

import java.util.Scanner;

public class DistanceEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("거리 입력(km): ");
        int km = scanner.nextInt();
        if(km<=1){
            System.out.println("도보");
        }
        else if(km<=10){
            System.out.println("자전거");
        }
        else if(km<=100){
            System.out.println("자동차");
        }
        else{
            System.out.println("비행기");
        }
    }
}
