public class Counter {

    private int count = 0;

    public synchronized void inc() {
        count++;
    }

    public synchronized void dec() {
        count--;
    }

    public int getValue() {
        return count;
    }
}
