package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
// alt + ← i alt + → (cmd + option + ← i cmd + option + →) przenosi nas do ostatniej lokacji, którą edytowaliśmy
    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
