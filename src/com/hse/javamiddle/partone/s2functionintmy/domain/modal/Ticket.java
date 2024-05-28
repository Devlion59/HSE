package com.hse.javamiddle.partone.s2functionintmy.domain.modal;

/**
 * Интерфейс предоставляет метод проверки на "счастливость"
 */
public interface Ticket {

    /**
     * @return возвращает признак "счастливости" билета
     */
    default boolean isLucky() {
        int divisor = (int) Math.pow(10, getDigits() / 2);

        int firstHalf = getNumber() / divisor;
        int lastHalf = getNumber() % divisor;

        return getDigitalSum(firstHalf) == getDigitalSum(lastHalf);
    }

    /**
     * @param number число
     * @return сумма цифр числа
     */
    private int getDigitalSum(int number) {
        int result = 0;
        do {
            result += number % 10;
        } while ((number /= 10) > 0);
        return result;
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

