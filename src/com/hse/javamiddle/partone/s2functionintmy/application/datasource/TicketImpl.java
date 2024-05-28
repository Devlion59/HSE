package com.hse.javamiddle.partone.s2functionintmy.application.datasource;

import com.hse.javamiddle.partone.s2functionintmy.domain.modal.Ticket;

/**
 * Сущность Билет
 */
public class TicketImpl implements Ticket {

    private final int ticketNumber;
    private final int digCounts;

    /**
     * @param ticketNumber номер билета
     * @param digCounts количество цифр в билете
     */
    public TicketImpl(int ticketNumber, int digCounts) {
        this.ticketNumber = ticketNumber;
        this.digCounts = digCounts;
    }

    /**
     * @return номер билета
     */
    @Override
    public int getNumber() {
        return ticketNumber;
    }

    /**
     * @return количество цифр в билете
     */
    @Override
    public int getDigits() {
        return digCounts;
    }

/*
    перенесли в интерфейс  Ticket как дефолтные и приватные методы
    @Override
    public boolean isLucky() {
        int divisor = (int) Math.pow(10, digCounts / 2);
        return (getDigitalSum(ticketNumber / divisor) == getDigitalSum(ticketNumber % divisor));
    }*/

/*    private static int getDigitalSum(int number) {
        int result = 0;
        do {
            result += number % 10;
        } while ((number /= 10) > 0);
        return result;
    }*/

}
