package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
        }

    public static double subtractionAndDivision(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double sumAll(double sumAndMultiply, double subtractionAndDivision) {
        return sumAndMultiply + subtractionAndDivision;
    }

    public static void main(String[] args) {
        double s1 = sumAndMultiply(10, 20);
        double s2 = subtractionAndDivision(10, 20);
        System.out.println("Результат расчета равен: " + s1);
        System.out.println("Результат расчета равен: " + s1);
        System.out.println("Результат расчета суммы всех четырех операций: " + sumAll(s1, s2));
    }
}

