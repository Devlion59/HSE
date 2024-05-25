package com.hse.javamiddle.partone.task2.domain.application;

import com.hse.javamiddle.partone.task2.domain.buisnes.TicketIterator;
import com.hse.javamiddle.partone.task2.domain.modal.Ticket;

public class EvaluatorImpl implements Evaluator {

    private final TicketIterator ticketIterator;

    public EvaluatorImpl(TicketIterator ticketIterator) {
        this.ticketIterator = ticketIterator;
    }

    @Override
    public int evaluate() {
        int count = 0;
        int digits = 6;

        for (; ticketIterator.hasNext();) {
            Ticket ticket = ticketIterator.next();
            if (ticket.isLucky()){
                count++;
            }
        }

/*        for (int i = 0; i < Math.pow(10, digits); i++) {
            Ticket ticket = ticketIterator.apply(i);
            if (!ticket.isLucky()) {
                continue;
            }
            count++;
        } */

        return count;
    }
}
