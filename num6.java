package ru.omsu;

import java.util.Scanner;

import static java.lang.Math.abs;

public class num6 {
    public static void main(String[] args) {
        double x;
        double y;
        System.out.println("Ввеедите коэфиценты x, y, и с для первого уравнения.");
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double c1 = in.nextDouble();
        System.out.println("Ввеедите коэффиценты x, y, и с для второго уравнения.");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double c2 = in.nextDouble();

        if (x1 * y2 - x2 * y1 != 0) {
            x = (c1 * y2 - y1 * c2) / (x1 * y2 - x2 * y1);
            y = (x1 * c2 - c1 * x2) / (x1 * y2 - x2 * y1);
            System.out.println("x=" + x + ", y=" + y);
        }
        else{
            System.out.println("Корней нет.");
        }
    }
}
