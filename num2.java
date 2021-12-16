package ru.omsu;
import java.util.Scanner;

public class num2 {
    public static void main(String[] args){
        System.out.println("Введите a, b, c");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        System.out.println("a*b*c=" + a*b*c);
        System.out.println("avr=" + (a+b+c)/3);
        if (a<b && a<c){
            System.out.println(a);
            if (b<c){
                System.out.println(b);
                System.out.println(c);
            }
            else{
                System.out.println(c);
                System.out.println(b);
            }
        }
        else if (b<a && b<c){
            System.out.println(b);
            if (a<c){
                System.out.println(a);
                System.out.println(c);
            }
            else {
                System.out.println(c);
                System.out.println(a);
            }
        }
        else if (c<a && c<b){
            System.out.println(c);
            if (a<b){
                System.out.println(a);
                System.out.println(b);
            }
            else {
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}
