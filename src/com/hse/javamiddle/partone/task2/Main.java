package com.hse.javamiddle.partone.task2;

import com.hse.javamiddle.partone.task2.domain.buisnes.TicketIterator;
import com.hse.javamiddle.partone.task2.domain.application.EvaluatorImpl;

public class Main {

    public static void main(String[] args) {
        EvaluatorImpl calc = new EvaluatorImpl(new TicketIterator(6));
        System.out.printf("Всего %d шестизначных счастливых билетов", calc.evaluate());
    }
}
