package org.hse.course.domain.model;

import java.util.function.Function;

/**
 * Интерфейс предоставляет метод проверки на "счастливость"
 */
public interface Ticket {

    /**
     * @param number число
     * @return сумма цифр числа
     */
    private int getDigitsSum(int number) {
        var result = 0;
        for (var tmpNumber = number; tmpNumber > 0; tmpNumber /= 10) {
            int currentDigit = tmpNumber % 10;
            result += currentDigit;
        }
        return result;
    }

    /**
     * @return возвращает признак "счастливости" билета
     */
    default boolean isLucky() {
        var divisor = (int) Math.pow(10, getDigits() / 2);

        var firstHalf = getNumber() / divisor;
        var lastHalf = getNumber() % divisor;

        return getDigitsSum(firstHalf) == getDigitsSum(lastHalf);
    }

    /**
     * @return номер билета
     */
    int getNumber();

    /**
     * @return количество цифр в билете
     */
    int getDigits();
}

