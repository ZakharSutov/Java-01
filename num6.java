package ru.omsu;
import java.util.Scanner;

import static java.lang.Math.abs;

public class num6 {
    public static void main(String[] args){
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
        if ((abs(x1) < 1e-9 && abs(y1) < 1e-9) || (abs(x2) < 1e-9 && abs(y2) < 1e-9)){
            System.out.println("Корней нет.");
        }
        else if ((abs(x1) < 1e-9 && abs(x2) < 1e-9) || (abs(y1) < 1e-9 && abs(y2) < 1e-9)){
            System.out.println("Корней нет.");
        }
        else if (abs(x1) < 1e-9 && abs(y2) < 1e-9){
            x = -1*c2/x2;
            y = -1*c1/y1;
            System.out.println("x=" + x + ", y=" + y);
        }
        else if (abs(x2) < 1e-9 && abs(y1) < 1e-9){
            x = -1*c1/x1;
            y = -1*c2/y2;
            System.out.println("x=" + x + ", y=" + y);
        }
        else if (abs(x1) < 1e-9){
            y = -1*c1/y1;
            x = (-1*c2+(-1*y2*y))/x2;
            System.out.println("x=" + x + ", y=" + y);
        }
        else if (abs(y1) < 1e-9){
            x = -1*c1/x1;
            y = (-1*c2+(-1*x2*x))/y2;
            System.out.println("x=" + x + ", y=" + y);
        }
        else if (abs(x2) < 1e-9){
            y = -1*c2/y2;
            x = (-1*c1+(-1*y1*y))/x1;
            System.out.println("x=" + x + ", y=" + y);
        }
        else if (abs(y2) < 1e-9){
            x = (-1*c2)/x2;
            y = (-1*c1+(-1*x1*x))/y1;
            System.out.println("x=" + x + ", y=" + y);
        }
        else if (x1*x2>0){
            y = -1*(c2-c1*(x2/x1))/(y2-y1*(x2/x1));
            x = (-1*c1+(-1*y1*y))/x1;
            System.out.println("x=" + x + ", y=" + y);
        }
        else if (x1*x2<0){
            y = -1*(c2+c1*(x2/x1))/(y2+y1*(x2/x1));
            x = (-1*c1+(-1*y1*y))/x1;
            System.out.println("x=" + x + ", y=" + y);
        }
    }
}
