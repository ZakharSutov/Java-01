package ru.omsu;
import java.util.Scanner;

public class num3 {
    public static void main(String[] args){
        System.out.println("Введите a, b, c");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("a*b*c=" + a*b*c);
        double avr = ((double)a+(double)b+(double)c)/3;
        System.out.println("avr=" + Math.round(avr));
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

