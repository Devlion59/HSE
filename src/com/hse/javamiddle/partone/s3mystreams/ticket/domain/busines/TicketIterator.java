package com.hse.javamiddle.partone.s3mystreams.ticket.domain.busines;

import com.hse.javamiddle.partone.s3mystreams.ticket.domain.model.Ticket;

import java.util.Iterator;

/**
 * Итератор по всем возможным билетам
 */
public interface TicketIterator extends Iterator<Ticket> {
}
