package com.hse.javamiddle.partone.s3mystreams.ticket;

import com.hse.javamiddle.partone.s3mystreams.ticket.datasource.TicketIteratorImpl;
import com.hse.javamiddle.partone.s3mystreams.ticket.datasource.TicketRecordIteratorImpl;
import com.hse.javamiddle.partone.s3mystreams.ticket.domain.application.EvaluatorImpl;

/**
 * Приложение для вычисления количества шестизначных счастливых билетов
 */
public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        var evaluator = new EvaluatorImpl(new TicketRecordIteratorImpl(6));
        var result = evaluator.evaluate();

        long duration  = System.currentTimeMillis()-startTime;

        System.out.println(String.format("Всего %d шестизначных счастливых билетов. Получено за %d секунд", result, duration));

    }
}