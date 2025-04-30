package week4;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("섭씨 온도: ");
        double cel = scanner.nextInt();
        scanner.nextLine();

        double fahrenheit = (cel * 1.8) + 32;

        System.out.println("화씨 온도 : " + fahrenheit);


    }
}
