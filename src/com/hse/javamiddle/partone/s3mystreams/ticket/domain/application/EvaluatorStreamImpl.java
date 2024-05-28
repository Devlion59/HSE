package com.hse.javamiddle.partone.s3mystreams.ticket.domain.application;


import com.hse.javamiddle.partone.s3mystreams.ticket.domain.model.Ticket;

import java.util.stream.Stream;

/**
 * Реализация {@link Evaluator} на основе {@link java.util.stream.Stream}
 */
public class EvaluatorStreamImpl implements Evaluator {

    private final Stream<Ticket> ticketStream;

    public EvaluatorStreamImpl(Stream<Ticket> ticketStream) {
        this.ticketStream = ticketStream;
    }

    public int evaluate() {
        long count = ticketStream.filter(Ticket::isLucky).count();
        return (int) count;
    }
}
