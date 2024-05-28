package com.hse.javamiddle.partone.s2functionintmy.application.datasource;

import com.hse.javamiddle.partone.s2functionintmy.domain.modal.Ticket;

public class TicketRecordIteratorImpl extends TicketIteratorImpl {

    public TicketRecordIteratorImpl(int digits) {
        super(digits);
    }

    @Override
    protected Ticket getTicket() {
        return new TicketRecordImpl(getCurrent(), getDigits());
    }
}
