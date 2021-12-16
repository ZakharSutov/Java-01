package ru.omsu;

import java.util.Scanner;

class Arr {
    int[] arr;
    int lnth;

    public Arr() {
    }

    public void Set(int lnth) {
        this.lnth = lnth;
        arr = new int[lnth];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < lnth; i++) {
            arr[i] = in.nextInt();
        }
    }

    public void Print() {
        for (int j = 0; j < lnth - 1; j++) {
            System.out.print(arr[j] + ", ");
        }
        System.out.println(arr[lnth - 1] + ".");
    }

    public int Sum() {
        int sum = 0;
        for (int i = 0; i < lnth; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int Enum() {
        int count = 0;
        for (int i = 0; i < lnth; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public int Num(int a, int b) {
        int count = 0;
        for (int i = 0; i < lnth; i++) {
            if (arr[i] >= a && arr[i] <= b) {
                count += 1;
            }
        }
        return count;
    }

    public boolean Positive() {
        for (int i = 0; i < lnth; i++) {
            if (arr[i] >= 0) {
                return true;
            }
        }
        return false;
    }

    public void Upend() {
        for (int i = 0; i < lnth / 2; i++) {
            int x = arr[i];
            arr[i] = arr[lnth - 1 - i];
            arr[lnth - 1 - i] = x;
        }
        for (int j = 0; j < lnth - 1; j++) {
            System.out.print(arr[j] + ", ");
        }
        System.out.println(arr[lnth - 1] + ".");
    }
}

public class num8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива.");
        int lnth = in.nextInt();
        System.out.println("Введите элементы массива.");
        Arr arr = new Arr();
        arr.Set(lnth);
        arr.Print();
        System.out.println("Сумма ровна " + arr.Sum());
        System.out.println("Четных чисел " + arr.Enum());
        System.out.println("Введите пределы а и b.");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Количества элементов на отрезке (" + a + "," + b + ") " + " = " + arr.Num(a, b));
        if (arr.Positive()) {
            System.out.println("Все элементы массива положительные.");
        } else {
            System.out.println("Не все элементы массива положительные.");
        }
        arr.Upend();
    }
}

