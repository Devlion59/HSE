package com.hse.javamiddle.partone.s2functionintmy;

import com.hse.javamiddle.partone.s2functionintmy.application.datasource.TicketRecordIteratorImpl;
import com.hse.javamiddle.partone.s2functionintmy.domain.buisnes.TicketIterator;
import com.hse.javamiddle.partone.s2functionintmy.domain.application.EvaluatorImpl;

public class Main {

    public static void main(String[] args) {
        EvaluatorImpl evaluator = new EvaluatorImpl(new TicketRecordIteratorImpl(6));
        System.out.printf("Всего %d шестизначных счастливых билетов", evaluator.evaluate());
    }
}
