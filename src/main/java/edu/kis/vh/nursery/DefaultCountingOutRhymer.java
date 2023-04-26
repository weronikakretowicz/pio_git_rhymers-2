package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_MAX_SIZE = 12;
    public static final int FULL = NUMBERS_MAX_SIZE - 1;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int IF_EMPTY = -1;
    private final int[] numbers = new int[NUMBERS_MAX_SIZE];

    public int total = EMPTY_RHYMER_INDICATOR;

    private int total = -1;

    public int getTotal() {
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

    protected int peekaboo() {
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
