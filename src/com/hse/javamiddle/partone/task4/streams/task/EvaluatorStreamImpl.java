package com.hse.javamiddle.partone.task4.streams.task;

public class EvaluatorStreamImpl implements Evaluator {

    private final Stream<Ticket> ticketStream;

    public EvaluatorStreamImpl(Stream<Ticket> ticketStream) {
        this.ticketStream = ticketStream;
    }

    public int evaluate() {
        long count = ticketStream.filter()
    }
}
