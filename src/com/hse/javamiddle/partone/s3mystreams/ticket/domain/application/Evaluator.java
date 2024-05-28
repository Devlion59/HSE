package com.hse.javamiddle.partone.s3mystreams.ticket.domain.application;

/**
 * Сервис для вычисления количества шестизначных счастливых билетов
 */
public interface Evaluator {
    /**
     * Вычисляет количество шестизначных счастливых билетов
     */
    int evaluate();
}
