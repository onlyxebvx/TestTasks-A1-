package org.A1.task2;

import java.math.BigDecimal;

public class Calculate {

    public static BigDecimal calculateUn(int n) {
        BigDecimal sum = BigDecimal.ZERO;
        BigDecimal factorialN = BigDecimal.ONE;

        for (int i = 1; i <= n; i++) {
            // вычисляем факториал i
            BigDecimal factorialI = BigDecimal.ONE;
            for (int j = 1; j <= i; j++) {
                factorialI = factorialI.multiply(BigDecimal.valueOf(j));
            }

            // суммируем факториалы от 1 до n
            sum = sum.add(factorialI);

            // вычисляем факториал n
            if (i == n) {
                factorialN = factorialI;
            }
        }

        // вычисляем значение un
        BigDecimal un = sum.divide(factorialN, 6, BigDecimal.ROUND_HALF_UP).divide(BigDecimal.valueOf(n), 6, BigDecimal.ROUND_HALF_UP);
        return un;
    }

    public static void main(String[] args) {
        int n = 100;
        int n1=5;
        BigDecimal un = calculateUn(n);
        System.out.println("un = " + un);
        System.out.println("un = " + calculateUn(n1));
        System.out.println("un = " + calculateUn(50));

        // Вывод: при n-> ∞ un -> 0.

    }
}
