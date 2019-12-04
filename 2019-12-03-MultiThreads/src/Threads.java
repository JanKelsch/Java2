public class Threads extends Thread {

    Counter counter;
    boolean inc;

    public Threads(Counter c, boolean inc) {
        this.counter = c;
        this.inc = inc;
    }

    public void run() {
        for (int i = 0; i < 2000; i++) {
            if (inc) {
                counter.inc();
            } else {
                counter.dec();
            }
        }
    }
}
