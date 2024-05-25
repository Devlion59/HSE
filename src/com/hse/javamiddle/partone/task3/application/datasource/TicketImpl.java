package org.hse.course.application.datasource;

import org.hse.course.domain.model.Ticket;

/**
 * Сущность Билет
 */
public class TicketImpl implements Ticket {
    private final int number;
    private final int digits;

    /**
     * @param number номер билета
     * @param digits количество цифр в билете
     */
    public TicketImpl(int number, int digits) {
        this.number = number;
        this.digits = digits;
    }

    /**
     * @return номер билета
     */
    @Override
    public int getNumber() {
        return number;
    }

    /**
     * @return количество цифр в билете
     */
    @Override
    public int getDigits() {
        return digits;
    }
}
