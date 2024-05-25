package com.hse.javamiddle.partone.task4.streams.task.datasource;

import org.hse.course.domain.model.Ticket;

public class TicketRecordIteratorImpl extends TicketIteratorImpl {
    public TicketRecordIteratorImpl(int digits) {
        super(digits);
    }

    @Override
    protected Ticket getTicket() {
        return new TicketRecordImpl(getCurrent(), getDigits());
    }
}
