package com.hse.javamiddle.partone.task1;

public class Main {

    public static void main(String[] args) {
        int ticketsCount = 0;
        int digitsNumber = 6;
        int divisor = (int) Math.pow(10, digitsNumber /2);

        for (int i = 0; i < Math.pow(10, digitsNumber); i++) {
            if (getDigitalsSum(i/divisor) == getDigitalsSum(i % divisor)) {
                ticketsCount++;
            }
        }
        System.out.printf("Всего %d шестизначных счастливых билетов", ticketsCount);
    }

    public static int getDigitalsSum(int number) {
        int result = 0;
        do {
            result += number % 10;
        } while ((number/=10) > 0);
        return result;
    }
}
