package ru.job4j.condition;
import java.lang.Math;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int subtractionX = x2 - x1;
        int subtractionY = y2 - y1;
        double exponentiationX = Math.pow(subtractionX, 2);
        double exponentiationY = Math.pow(subtractionY, 2);
        double sumXY = exponentiationX + exponentiationY;
        double rsl = Math.sqrt(sumXY);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(1, 2, 1, 2);
        System.out.println("result2 (1, 1) to (1, 1) " + result);
    }
}
