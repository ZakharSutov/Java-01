package ru.omsu;

import java.util.Scanner;

import static java.lang.Math.sqrt;

class Vector3D {
    private double x, y, z;

    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void Vector3D(Point3D v1, Point3D v2) {
        this.x = v2.GetX() - v1.GetX();
        this.y = v2.GetY() - v1.GetY();
        this.z = v2.GetZ() - v1.GetZ();
    }

    public double GetX(){
        return x;
    }

    public double GetY(){
        return y;
    }

    public double GetZ(){
        return z;
    }

    public double length(){
        return sqrt(x*x+y*y+z*z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Double.compare(vector3D.x, x) == 0 && Double.compare(vector3D.y, y) == 0 && Double.compare(vector3D.z, z) == 0;
    }

    public void PrintV(){
        System.out.printf("%.4f %.4f %.4f \n", x, y, z);
    }
}

public class num16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector3D v1 = new Vector3D();
        Vector3D v2 = new Vector3D();
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D();
        v1.PrintV();
        v2.PrintV();
        System.out.println("Введите координаты первого вектора x,y,z.");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double z1 = in.nextDouble();
        v1.Vector3D(x1, y1, z1);
        System.out.println("Введите второй вектор по двум точкам.");
        System.out.println("Введите координаты первой точки x,y,z.");
        double pointx1 = in.nextDouble();
        double pointy1 = in.nextDouble();
        double pointz1 = in.nextDouble();
        p1.Point3D(pointx1, pointy1, pointz1);
        System.out.println("Введите координаты второй точки x,y,z.");
        double pointx2 = in.nextDouble();
        double pointy2 = in.nextDouble();
        double pointz2 = in.nextDouble();
        p2.Point3D(pointx2, pointy2, pointz2);
        v2.Vector3D(p1, p2);
        v1.PrintV();
        v2.PrintV();
        System.out.println("Длина первого вектора.");
        System.out.println(v1.length());
        if (!v1.equals(v2)){
            System.out.println("Первый вектор не равен второму.");
        } else {
            System.out.println("Первый вектор равен второму.");
        }
    }
}
