package partOne.taskTwo;

import java.util.function.Function;

public interface MaybeLucky {

    boolean isLucky();
}

class TicketGenerator implements Function<Integer, MaybeLucky> {
    @Override
    public MaybeLucky apply(Integer number) {
        return new Ticket(number, 6);
    }
}

class Ticket implements MaybeLucky{

    private final int ticketNumber;
    private final int digCounts;

    public Ticket(int number, int digCounts) {
        this.ticketNumber = number;
        this.digCounts = digCounts;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public int getDigCounts() {
        return digCounts;
    }

    @Override
    public boolean isLucky() {
        int divisor = (int) Math.pow(10,digCounts/2);
        return (getDigitalSum(ticketNumber/divisor) == getDigitalSum(ticketNumber % divisor));
    }

    private static int getDigitalSum(int number) {
        int result = 0;
        do {
            result += number % 10;
        } while ((number/=10) > 0);
        return result;
    }
}
