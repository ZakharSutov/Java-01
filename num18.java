package ru.omsu;

import java.util.Scanner;

import static java.lang.Math.sqrt;

class Vector3DArray {
    private final double[][] arr;
    private final int length;

    public Vector3DArray(int length) {
        this.length = length;
        arr = new double[3][length];
        for (int i = 0; i < length; i++) {
            arr[0][i] = 0;
            arr[1][i] = 0;
            arr[2][i] = 0;
        }
    }

    public int getLength() {
        return length;
    }

    public void inputVector(int i, double x, double y, double z) {
        arr[0][i - 1] = x;
        arr[1][i - 1] = y;
        arr[2][i - 1] = z;
    }

    public double maxLength() {
        double max = 0, max1;
        for (int i = 0; i < length; i++) {
            max1 = sqrt(arr[0][i] * arr[0][i] + arr[1][i] * arr[1][i] + arr[2][i] * arr[2][i]);
            if (max1 > max) {
                max = max1;
            }
        }
        return max;
    }

    public int searchVector(double x, double y, double z) {
        int j = -1, i = 0;
        while (i < length && j == -1) {
            if (arr[0][i] == x && arr[1][i] == y && arr[2][i] == z) {
                j = i;
            }
            i++;
        }
        return j;
    }

    public Vector3D sumAllVectors() {
        double x = 0, y = 0, z = 0;
        Vector3D v = new Vector3D();
        for (int i = 0; i < length; i++) {
            x += arr[0][i];
            y += arr[1][i];
            z += arr[2][i];
        }
        v.Vector3D(x, y, z);
        return v;
    }

    public Vector3D linearCombination(double[] coeff) {
        double x = 0, y = 0, z = 0;
        Vector3D v = new Vector3D();
        for (int i = 0; i < length; i++) {
            if (length != coeff.length) {
                x = 0;
                y = 0;
                z = 0;
            } else {
                x += coeff[i] * arr[0][i];
                y += coeff[i] * arr[1][i];
                z += coeff[i] * arr[2][i];
            }
        }
        v.Vector3D(x, y, z);
        return v;
    }

    public void arrPoint(Point3D p, double[][] arrpoint) {
        arrpoint[0][0] = p.GetX();
        arrpoint[1][0] = p.GetY();
        arrpoint[2][0] = p.GetZ();
        for (int i = 1; i <= length; i++) {
            arrpoint[0][i] = arrpoint[0][i - 1] + arr[0][i - 1];
            arrpoint[1][i] = arrpoint[1][i - 1] + arr[1][i - 1];
            arrpoint[2][i] = arrpoint[2][i - 1] + arr[2][i - 1];
        }
    }

    public void printArr() {
        for (int i = 0; i < length; i++) {
            System.out.printf("%.4f %.4f %.4f \n", arr[0][i], arr[1][i], arr[2][i]);
        }
    }
}

public class num18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива.");
        int length = in.nextInt();
        Vector3DArray arr = new Vector3DArray(length);
        for(int i = 0; i < length; i++){
            double x0 = -10 + (Math.random() * 10);
            double y0 = -10 + (Math.random() * 10);
            double z0 = -10 + (Math.random() * 10);
            arr.inputVector(i, x0, y0, z0);
        }
        arr.printArr();
        System.out.println("Введите номер вектора, который хотите заменить.");
        int num = in.nextInt();
        System.out.println("Введите координаты вектора.");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        arr.inputVector(num, x, y, z);
        arr.printArr();
        System.out.println("Наибольшая длина вектора = " + arr.maxLength());
        System.out.println("Введите координаты вектора, который хотите найти.");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double z1 = in.nextDouble();
        int search = arr.searchVector(x1, y1, z1);
        System.out.println(search);
        System.out.print("Сумма всех векторов = ");
        arr.sumAllVectors().PrintV();
        System.out.println("Введите размер массива с коэффицентами.");
        int lengthCoef = in.nextInt();
        double[] coef = new double[lengthCoef];
        System.out.println("Заполните массив с коэффицентами.");
        for(int j = 0; j < lengthCoef; j++){
            double c = in.nextDouble();
            coef[j] = c;
        }
        arr.linearCombination(coef).PrintV();
        System.out.println("Введите координаты точки.");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double z2 = in.nextDouble();
        Point3D p = new Point3D();
        p.Point3D(x2, y2, z2);
        double[][] arrpoint = new double[3][length + 1];
        arr.arrPoint(p, arrpoint);
        for (int i = 0; i < length; i++) {
            System.out.printf("%.4f %.4f %.4f \n", arrpoint[0][i], arrpoint[1][i], arrpoint[2][i]);
        }

    }
}
