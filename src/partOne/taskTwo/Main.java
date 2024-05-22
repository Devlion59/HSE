package partOne.taskTwo;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator(new TicketGenerator());
        System.out.printf("Всего %d шестизначных счастливых билетов", calc.calculate());
    }
}
