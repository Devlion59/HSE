package org.hse.course.domain.application;

import org.hse.course.domain.application.Evaluator;
import org.hse.course.domain.busines.TicketIterator;

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

        /*var digits = 6;

        for (var number = 0; number < Math.pow(10, digits); number++) {
            var ticket = ticketIterator.apply(number);
            if (!ticket.isLucky()) {
                continue;
            }

            quantity++;
        }*/

        return quantity;
    }
}
