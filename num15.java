package ru.omsu;

import java.util.Scanner;

class Point3D {
    double x;
    double y;
    double z;

    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public void Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void SetX(double x) {
        this.x = x;
    }

    public void SetY(double y) {
        this.y = y;
    }

    public void SetZ(double z) {
        this.z = z;
    }


    public double GetX() {
        return x;
    }

    public double GetY() {
        return y;
    }

    public double GetZ() {
        return z;
    }

    public void Print() {
        System.out.printf("%.4f %.4f %.4f \n", x, y, z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(point3D.x, x) == 0 && Double.compare(point3D.y, y) == 0 && Double.compare(point3D.z, z) == 0;
    }
}

public class num15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Point3D point1 = new Point3D();
        Point3D point2 = new Point3D();
        point1.Print();
        point2.Print();
        System.out.println("Введите координаты первой точки x,y,z.");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double z1 = in.nextDouble();
        point1.Point3D(x1, y1, z1);
        System.out.println("Введите координаты второй точки x,y,z.");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double z2 = in.nextDouble();
        point2.Point3D(x2, y2, z2);
        point1.Print();
        point2.Print();
        if (point1.GetX() == point2.GetX() && point1.GetY() == point2.GetY() && point1.GetZ() == point2.GetZ()) {
            System.out.println("Точки равны.");
        } else {
            System.out.println("Точки не равны.");
        }
        if (!point1.equals(point1)) {
            System.out.println("Первая точка не равна сама себе.");
        } else {
            System.out.println("Первая точка равна сама себе.");
        }
    }
}
