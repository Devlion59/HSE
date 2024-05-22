package partOne.taskTwo;

import java.util.function.Function;

public class Calculator {

    private final Function<Integer, MaybeLucky> byNumber;

    public Calculator(Function<Integer, MaybeLucky> byNumber) {
        this.byNumber = byNumber;
    }

    public int calculate() {
        int count = 0;
        int digits = 6;

        for (int i = 0; i < Math.pow(10, digits); i++) {
            MaybeLucky ticket = byNumber.apply(i);
            if (!ticket.isLucky()) {
                continue;
            }
            count++;
        }
        return count;
    }
}
