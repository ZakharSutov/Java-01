package ru.omsu;
import java.util.Scanner;
import static java.lang.Math.exp;
import static java.lang.Math.abs;

public class num7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите х.");
        double x = in.nextDouble();
        System.out.println("Введите точность разложения.");
        double eps = in.nextDouble();
        double ans = 1;
        double z = 1;
        int m = 0;
        for (int i = 1; z > eps; i++){
            if (m == 1){
                z = -1*z;
                m = 0;
            }
            z = z*x/i;
            ans += z;
            if (z<0){
                z = abs(z);
                m = 1;
            }
        }
        System.out.println("e^" + (int)x + " = " + ans);
        System.out.println("e^" + (int)x + " = " + exp(x));
    }
}
