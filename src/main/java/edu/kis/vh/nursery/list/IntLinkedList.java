package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int IF_EMPTY_RETURN_VAL = -1;
    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())

            return IF_EMPTY_RETURN_VAL;
        return last.value;

    }

    public int pop() {
        if (isEmpty())

            return IF_EMPTY_RETURN_VAL;
        int ret = last.value;
        last = last.prev;

        return ret;
    }

}
