package com.hse.javamiddle.partone.task2.domain.modal;

public interface Ticket {

    int getNumber();
    int getDigits();

    default boolean isLucky() {
        int divisor = (int) Math.pow(10, getDigits() / 2);
        return (getDigitalSum(getNumber() / divisor) == getDigitalSum(getNumber() % divisor));
    }

    private int getDigitalSum(int number) {
        int result = 0;
        do {
            result += number % 10;
        } while ((number /= 10) > 0);
        return result;
    }

}

