package com.hse.javamiddle.partone.task1.simplesolution;

public class simpleTicketName {

    public static void main(String[] args) {
        int ticketsCount = 0;
        int digitsNumber = 6;
        int divisor = (int) Math.pow(10, digitsNumber /2);


        /*
        Генерация номеров билетов от 1 по 999999
        Вызов метода для посчета цифр в билете
        Определение статуса билета - счастливый или нет
        Подсчет количества счастливых билетов
         */
        for (int i = 0; i < Math.pow(10, digitsNumber); i++) {
            if (getDigitalsSum(i/divisor) == getDigitalsSum(i % divisor)) {
                ticketsCount++;
            }
        }
        System.out.printf("Всего %d шестизначных счастливых билетов", ticketsCount);
    }

    /**
     * Метод считает сумму цифр в числе
     * @param number часть номера билета
     * @return сумма цифр в числе
     */

    public static int getDigitalsSum(int number) {
        int result = 0;
        do {
            result += number % 10;
        } while ((number/=10) > 0);
        return result;
    }
}
