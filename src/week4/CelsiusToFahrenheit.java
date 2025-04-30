package week4;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("입력: ");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("출력: " + fahrenheit);
    }
}
