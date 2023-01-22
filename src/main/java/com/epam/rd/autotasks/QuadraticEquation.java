package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

//import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b * b - 4.0 * a * c;
        if (d > 0.0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println(r2 + " " + r1);
        } else if (d == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println((int)r1);
        } else {
            System.out.println("no roots");

        }
    }

}