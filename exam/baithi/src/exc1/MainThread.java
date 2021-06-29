package exc1;

import exc1.entity.ConversionUtil;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        ConversionUtil conversionUtil = new ConversionUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter degrees: ");
        double Degree = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("The temperature after conversion C to F is: " + conversionUtil.celciusToFahrenheit(Degree));
        System.out.println("The temperature after conversion F to C is: " + conversionUtil.fahrenheitToCelsius(Degree));

    }
}
