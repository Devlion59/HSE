package com.hse.javamiddle.partone.task2.domain.buisnes;

import com.hse.javamiddle.partone.task2.application.datasource.TicketImpl;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TicketIterator implements Iterator<TicketImpl> {

    private final int maxNumber;
    private final int digits;
    private int current = 0;

    public TicketIterator(int digits) {
        this.maxNumber = (int) Math.pow(10, digits);
        this.digits = digits;
    }

    @Override
    public boolean hasNext() {
        return current < maxNumber;
    }

    @Override
    public TicketImpl next(){
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }

        TicketImpl ticket = getTicket();
        current++;
        return ticket;
    }

    protected TicketImpl getTicket() {
        return new TicketImpl(current, digits);
    }



}
