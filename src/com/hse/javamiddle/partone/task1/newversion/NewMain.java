package com.hse.javamiddle.partone.task1.newversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NewMain {

    public static void main(String[] args) {
        Map<Integer, ArrayList<Integer>> numbers = new HashMap<>();
        int count = 0;


        /**
         * Принимается, что номер билета состоит из 6 цифр
         * Счастчивым билетом является тот, у которого сумма первых трех цифр равна сумме последних трех цифр
         * Для снижения итераций вычисляем сумму цифр в числах от 1 по 999
         * Максимальная сумма цифр может быть 27
         * Для хранения используем хэш-таблицу, где ключ - сумма цифр в числе, значение - список чисел
         */

        for (int number = 0; number < 1000; number++) {
            int numberDigitsSum = digitsSum(number);
            if (!numbers.containsKey(numberDigitsSum)){             //если ключа нет в табице,
                numbers.put(numberDigitsSum, new ArrayList<>());    //добавляем его и создаем в нем список для хранения чисел
            }
            numbers.get(numberDigitsSum).add(number);               //добавляем в список, который хранится в ключе (сумма цифр в числе), число
        }

        /**
         * Для каждого списка чисел определяем количество возможных комбинаций в билете
         * Т.к. билет состоит из двух частей=двух чисел от 1 до 999 (первые три цифры и последние три цифры),
         * а сумма цифр в числах равна, то необходимо количество чисел в каждом списке возвести в степень 2.
         * общее количество комбинаций будет равно количеству счастливых билетов.
         */

        for (Integer i : numbers.keySet()) {
            int length = (numbers.get(i)).size();
            count += (int) Math.pow(length, 2);
        }
        System.out.printf("Всего %d шестизначных счастливых билетов", count);
    }

    /**
     * Метод считает сумму цифр в числе
     * @param number число
     * @return сумма цифр в числе
     */
    private static int digitsSum(int number) {
        int result = 0;
        do {
            result += number % 10;
        } while ((number /= 10) > 0);
        return result;
    }
}