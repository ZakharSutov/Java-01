package ru.omsu;
import static java.lang.Math.abs;
import java.util.Scanner;

class Vector3DProcessor {

    public Vector3D sum(Vector3D v1, Vector3D v2) {
        Vector3D v = new Vector3D();
        v.Vector3D(v1.GetX() + v2.GetX(), v1.GetY() + v2.GetY(), v1.GetZ() + v2.GetZ());
        return v;
    }

    public Vector3D residual(Vector3D v1, Vector3D v2) {
        Vector3D v = new Vector3D();
        v.Vector3D(v1.GetX() - v2.GetX(), v1.GetY() - v2.GetY(), v1.GetZ() - v2.GetZ());
        return v;
    }

    public double scalarMulti(Vector3D v1, Vector3D v2) {
        return v1.GetX() * v2.GetX() + v1.GetY() * v2.GetY() + v1.GetZ() * v2.GetZ();
    }

    public Vector3D vectorMulti(Vector3D v1, Vector3D v2) {
        Vector3D v = new Vector3D();
        double tmpX = v1.GetY() * v2.GetZ() - v1.GetZ() * v2.GetY();
        double tmpY = -(v1.GetX() * v2.GetZ() - v1.GetZ() * v2.GetX());
        double tmpZ = v1.GetX() * v2.GetY() - v1.GetY() * v2.GetX();
        v.Vector3D(tmpX, tmpY, tmpZ);
        return v;
    }

    public boolean Collin(Vector3D v1, Vector3D v2) {
        double tmpX = v1.GetY() * v2.GetZ() - v1.GetZ() * v2.GetY();
        double tmpY = -(v1.GetX() * v2.GetZ() - v1.GetZ() * v2.GetX());
        double tmpZ = v1.GetX() * v2.GetY() - v1.GetY() * v2.GetX();
        return Double.compare(abs(tmpX), 0) == 0 && Double.compare(abs(tmpY), 0) == 0 && Double.compare(abs(tmpZ), 0) == 0;
    }
}

public class num17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector3D v1 = new Vector3D();
        Vector3D v2 = new Vector3D();
        Vector3DProcessor v = new Vector3DProcessor();
        v1.PrintV();
        v2.PrintV();
        System.out.println("Введите координаты первого вектора x,y,z.");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double z1 = in.nextDouble();
        v1.Vector3D(x1, y1, z1);
        System.out.println("Введите координаты второго вектора x,y,z.");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double z2 = in.nextDouble();
        v2.Vector3D(x2, y2, z2);
        System.out.println("Сумма: ");
        v.sum(v1, v2).PrintV();
        System.out.println("Разность: ");
        v.residual(v1, v2).PrintV();
        System.out.println("Скалярное произведение: " + v.scalarMulti(v1, v2));
        System.out.println("Векторное произведение: ");
        v.vectorMulti(v1, v2).PrintV();
        if (v.Collin(v1, v2) == true) {
            System.out.println("Вектора коллинеарны.");
        } else {
            System.out.println("Вектора не коллинеарны.");
        }

    }
}
