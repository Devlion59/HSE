package org.hse.course;

import org.hse.course.application.datasource.TicketIteratorImpl;
import org.hse.course.application.datasource.TicketRecordIteratorImpl;
import org.hse.course.domain.application.EvaluatorImpl;

/**
 * Приложение для вычисления количества шестизначных счастливых билетов
 */
public class Main {

    public static void main(String[] args) {
        var evaluator = new EvaluatorImpl(new TicketRecordIteratorImpl(6));
        var result = evaluator.evaluate();
        System.out.println(String.format("Всего %d шестизначных счастливых билетов", result));
    }
}