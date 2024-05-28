package com.hse.javamiddle.partone.s2functionintmy.domain.application;

import com.hse.javamiddle.partone.s2functionintmy.domain.buisnes.TicketIterator;
import com.hse.javamiddle.partone.s2functionintmy.domain.modal.Ticket;

/**
 * Реализация сервиса для вычисления количества шестизначных счастливых билетов
 */
public class EvaluatorImpl implements Evaluator {

    private final TicketIterator ticketIterator;

    public EvaluatorImpl(TicketIterator ticketIterator) {
        this.ticketIterator = ticketIterator;
    }

    /**
     * Вычисляет количество шестизначных счастливых билетов
     */
    @Override
    public int evaluate() {
        int quantity = 0;

        for (;ticketIterator.hasNext();) {
            Ticket ticket = ticketIterator.next();
            if (ticket.isLucky()){
                quantity++;
            }
        }

/*        for (int i = 0; i < Math.pow(10, digits); i++) {
            Ticket ticket = ticketIterator.apply(i);
            if (!ticket.isLucky()) {
                continue;
            }
            quantity++;
        } */

        return quantity;
    }
}
