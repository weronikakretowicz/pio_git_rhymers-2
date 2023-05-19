package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int IF_EMPTY_RETURN_VAL = -1;
    private Node last;
    private int i;

    /**
     * It pushes value 'i' to the list, if it's empty creates new list and add value
     * @param i value to be added
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * It checks if list is empty
     * @return Returns true if list is empty
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * It checks if list is full
     * @return Returns false becouse it's a dynamic structure, so it will never be full
     */
    public boolean isFull() {
        return false;
    }

    /**
     * It returns top value in the list
     * @return Returns IF_EMPTY_RETURN_VAL or the last value in the list
     */
    public int top() {
        if (isEmpty())
            return IF_EMPTY_RETURN_VAL;

        return last.value;

    }

    /**
     * It removes the last element from the list
     * @return Returns IF_EMPTY_RETURN_VAL if list is empty or return the last value and set pointer (last) to the previous node
     */
    public int pop() {
        if (isEmpty())

            return IF_EMPTY_RETURN_VAL;
        int ret = last.value;
        last = last.prev;

        return ret;
    }

}
