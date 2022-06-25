package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        result1 = SqArea.square(8, 3);
        System.out.println(" p = 8, k = 3, s = 3, real = " + result1);
        result1 = SqArea.square(10, 4);
        System.out.println(" p = 10, k = 4, s = 4, real = " + result1);
    }
}

