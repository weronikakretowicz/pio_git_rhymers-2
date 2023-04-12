package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int maxSize = 11;
    public static final int badIndex = -1;
    private int[] numbers = new int[SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == badIndex;
    }

    public boolean isFull() {
        return total == maxSize;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
