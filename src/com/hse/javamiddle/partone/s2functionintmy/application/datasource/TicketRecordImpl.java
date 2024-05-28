package com.hse.javamiddle.partone.s2functionintmy.application.datasource;

import com.hse.javamiddle.partone.s2functionintmy.domain.modal.Ticket;

/**
 * Реалищация интерфесйа {@link Ticket} с помощью record
 *
 * @param ticketNumber номер билета
 * @param digCounts количество цифр в билете
 */
public record TicketRecordImpl(int ticketNumber, int digCounts) implements Ticket {

    @Override
    public int getNumber() {
        return ticketNumber;
    }

    @Override
    public int getDigits() {
        return digCounts;
    }
}
