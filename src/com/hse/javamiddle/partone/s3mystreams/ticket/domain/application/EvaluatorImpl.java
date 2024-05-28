package com.hse.javamiddle.partone.s3mystreams.ticket.domain.application;

import com.hse.javamiddle.partone.s3mystreams.ticket.domain.busines.TicketIterator;

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
        var quantity = 0;

        for(;ticketIterator.hasNext();) {
            var ticket = ticketIterator.next();
            if (ticket.isLucky()) {
                quantity++;
            }
        }

        return quantity;
    }
}
