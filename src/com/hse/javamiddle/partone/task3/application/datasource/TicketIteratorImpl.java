package org.hse.course.application.datasource;

import org.hse.course.application.datasource.TicketImpl;
import org.hse.course.domain.model.Ticket;
import org.hse.course.domain.busines.TicketIterator;

import java.util.NoSuchElementException;

/**
 * Итератор по всем шестизначным билетам
 */
public class TicketIteratorImpl implements TicketIterator {
    private final int maxNumber;
    private final int digits;
    private int current = 0;

    public TicketIteratorImpl(int digits) {
        this.maxNumber = (int) Math.pow(10, digits);
        this.digits = digits;
    }

    @Override
    public boolean hasNext() {
        return current < maxNumber;
    }

    @Override
    public Ticket next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }

        var ticket = getTicket();
        current++;

        return ticket;
    }

    /**
     * @return объект, реализующий {@link Ticket}
     */
    protected Ticket getTicket() {
        return new TicketImpl(current, digits);
    }

    protected int getDigits() {
        return digits;
    }

    protected int getCurrent() {
        return current;
    }
}
