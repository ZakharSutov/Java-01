package ru.omsu;

import java.util.Scanner;

import static java.lang.Math.sin;

public class num5 {
    public static void main(String[] args) {
        System.out.println("Ввеедите пределы и шаг функции sin(x).");
        Scanner in = new Scanner(System.in);
        double lim1 = in.nextDouble();
        double lim2 = in.nextDouble();
        double step = in.nextDouble();
        if (step > 0){
            for (double i = lim1; i < lim2 || Math.abs(i - lim2) < 1e-9; i += step) {
                System.out.println(i + " = " + sin(i));
            }
        }
        if (step < 0){
            for (double i = lim2; i >= lim2 - step; i -= step) {
                System.out.println(i + " = " + sin(i));
            }
        }
        if (step == 0){
            System.out.println("Введите шаг.");
        }
    }
}
