package com.hse.javamiddle.partone.s2teacher.application.datasource;


import com.hse.javamiddle.partone.s2teacher.domain.model.Ticket;

/**
 * Реалищация интерфесйа {@link Ticket} с помощью record
 *
 * @param number номер билета
 * @param digits количество цифр в билете
 */
public record TicketRecordImpl(int number, int digits) implements Ticket {
    @Override
    public int getNumber() {
        return number();
    }

    @Override
    public int getDigits() {
        return digits();
    }
}
