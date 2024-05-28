package com.hse.javamiddle.partone.s2teacher;


import com.hse.javamiddle.partone.s2teacher.application.datasource.TicketRecordIteratorImpl;
import com.hse.javamiddle.partone.s2teacher.domain.application.EvaluatorImpl;

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