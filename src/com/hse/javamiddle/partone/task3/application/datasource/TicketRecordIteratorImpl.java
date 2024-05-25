package org.hse.course.application.datasource;

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
