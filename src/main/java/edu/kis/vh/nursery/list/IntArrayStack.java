package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.Stackable;

public class IntArrayStack implements Stackable {
    private int[] numbers = new int[12];

    public int total = -1;


    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
