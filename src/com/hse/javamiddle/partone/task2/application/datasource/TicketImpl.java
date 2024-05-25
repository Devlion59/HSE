package com.hse.javamiddle.partone.task2.application.datasource;

import com.hse.javamiddle.partone.task2.domain.modal.Ticket;

public class TicketImpl implements Ticket {

    private final int ticketNumber;
    private final int digCounts;

    public TicketImpl(int number, int digCounts) {
        this.ticketNumber = number;
        this.digCounts = digCounts;
    }

/*    @Override
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

    @Override
    public int getNumber() {
        return ticketNumber;
    }

    @Override
    public int getDigits() {
        return digCounts;
    }
}
