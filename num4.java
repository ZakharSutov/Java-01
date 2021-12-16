package ru.omsu;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class num4 {
    public static void main(String[] args) {
        System.out.println("Введите коэфицент x^2, x, c.");
        Scanner in = new Scanner(System.in);
        double x2 = in.nextDouble();
        double x = in.nextDouble();
        double c = in.nextDouble();
        double d = x * x - 4 * x2 * c;
        if (abs(x2) < 1e-9) {
            System.out.println("Error");
        } else if (abs(x) < 1e-9) {
            if (-1 * c < 0) {
                System.out.println("Корней нет.");
            } else {
                System.out.println("x=" + sqrt(abs(c)));
            }
        } else if (d < 0) {
            System.out.println("Вещественных корней нет.");
        } else if (abs(d) < 1e-9) {
            System.out.println("x=" + (-1 * x / 2 * x2));
        } else if (d > 0) {
            System.out.println("x1=" + (-1 * x + sqrt(d)) / 2 * x2);
            System.out.println("x2=" + (-1 * x - sqrt(d)) / 2 * x2);
        }
    }
}
