package com.hse.javamiddle.partone.s2functionintmy.domain.buisnes;

import com.hse.javamiddle.partone.s2functionintmy.application.datasource.TicketImpl;
import com.hse.javamiddle.partone.s2functionintmy.domain.modal.Ticket;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Итератор по всем возможным билетам
 */
public interface TicketIterator extends Iterator<Ticket> {

}
