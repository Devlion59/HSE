package com.hse.javamiddle.partone.task4.streams.task;

import com.hse.javamiddle.partone.task4.streams.task.domain.application.EvaluatorImpl;

/**
 * Приложение для вычисления количества шестизначных счастливых билетов
 */
public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        var evaluator = new EvaluatorImpl(new TicketRecordIteratorImpl(6));
        var result = evaluator.evaluate();

        long time = System.currentTimeMillis()-startTime;

        System.out.println(String.format("Всего %d шестизначных счастливых билетов. Получено за %d секунд", result, time));

    }
}