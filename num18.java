package ru.omsu;

import java.util.Scanner;

import static java.lang.Math.sqrt;

class Vector3DArray {
    private final Vector3D[] arr;
    private final int length;

    public Vector3DArray(int length) {
        this.length = length;
        arr = new Vector3D[length];
        for (int i = 0; i < length; i++) {
            arr[i] = new Vector3D();
        }
    }

    public int getLength() {
        return length;
    }

    public void inputVector(int i, Vector3D v) {
        arr[i] = v;
    }

    public double maxLength() {
        double max = 0, max1;
        for (int i = 0; i < length; i++) {
            max1 = arr[i].length(); //sqrt(arr[i].GetX() * arr[i].GetX() + arr[i].GetY() * arr[i].GetY() + arr[i].GetZ() * arr[i].GetZ());
            if (max1 > max) {
                max = max1;
            }
        }
        return max;
    }

    public int searchVector(double x, double y, double z) {
        int j = -1, i = 0;
        while (i < length && j == -1) {
            if (arr[i].GetX() == x && arr[i].GetY() == y && arr[i].GetZ() == z) {
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
            x += arr[i].GetX();
            y += arr[i].GetY();
            z += arr[i].GetZ();
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
                x += coeff[i] * arr[i].GetX();
                y += coeff[i] * arr[i].GetY();
                z += coeff[i] * arr[i].GetZ();
            }
        }
        v.Vector3D(x, y, z);
        return v;
    }

    public Point3D[] arrPoint(Point3D p) {
        double x, y, z;
        Point3D[] arrPoint = new Point3D[length];
        for (int i = 0; i < length; i++){
            arrPoint[i] = new Point3D();
        }
        x = p.GetX();
        y = p.GetY();
        z = p.GetZ();
        for (int i = 0; i < length; i++) {
            x += arr[i].GetX();
            y += arr[i].GetY();
            z += arr[i].GetZ();
            arrPoint[i].SetX(x);
            arrPoint[i].SetY(y);
            arrPoint[i].SetZ(z);
        }
        return arrPoint;
    }

    public void printArr() {
        for (int i = 0; i < length; i++) {
            System.out.printf("%.4f %.4f %.4f \n", arr[i].GetX(), arr[i].GetY(), arr[i].GetZ());
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
            double x0 = 0 + (int)(Math.random() * 10);
            double y0 = 0 + (int)(Math.random() * 10);
            double z0 = 0 + (int)(Math.random() * 10);
            Vector3D v = new Vector3D(x0, y0, z0);
            arr.inputVector(i, v);
        }
        arr.printArr();
        System.out.println("Введите номер вектора, который хотите заменить.");
        int num = in.nextInt();
        System.out.println("Введите координаты вектора.");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        Vector3D v1 = new Vector3D(x, y, z);
        arr.inputVector(num, v1);
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
        Point3D[] arrPoint = arr.arrPoint(p);
        for (int i = 0; i < length; i++) {
            System.out.printf("%.4f %.4f %.4f \n", arrPoint[i].GetX(), arrPoint[i].GetY(), arrPoint[i].GetZ());
        }

    }
}
