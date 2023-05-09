package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_MAX_SIZE = 12;
    private static final int FULL = NUMBERS_MAX_SIZE - 1;
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int IF_EMPTY = -1;
    private final int[] numbers = new int[NUMBERS_MAX_SIZE];
    private int total = EMPTY_RHYMER_INDICATOR;

    private int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == FULL;
    }

    public int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }

}
