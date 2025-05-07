package cond;

public class If5 {
    public static void main(String[] args) {

        int price = 10000;
        int age = 10;
        int dis = 0;
        if (price >= 10000) {
            dis += 1000;
            System.out.println("10000원이상 구매로 1000원할인");
        }

        if(age <= 10) {
            dis += 1000;
            System.out.println("어린이 할인으로 1000원 할인");
        }
        System.out.println("총 할인 금액: " + dis + "원");

    }
}