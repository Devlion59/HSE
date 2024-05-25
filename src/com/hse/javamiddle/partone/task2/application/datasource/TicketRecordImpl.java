package com.hse.javamiddle.partone.task2.application.datasource;

import com.hse.javamiddle.partone.task2.domain.modal.Ticket;

public record TicketRecordImpl(int ticketNumber, int digCounts) implements Ticket {

    @Override
    public int getNumber() {
        return ticketNumber;
    }

    @Override
    public int getDigits() {
        return digCounts;
    }
}
