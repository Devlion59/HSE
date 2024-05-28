package com.hse.javamiddle.partone.s3mystreams.ticket.datasource;

import com.hse.javamiddle.partone.s3mystreams.ticket.domain.model.Ticket;

public class TicketRecordIteratorImpl extends TicketIteratorImpl {
    public TicketRecordIteratorImpl(int digits) {
        super(digits);
    }

    @Override
    protected Ticket getTicket() {
        return new TicketRecordImpl(getCurrent(), getDigits());
    }
}
