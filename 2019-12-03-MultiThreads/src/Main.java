public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Thread t1 = new Thread(new Threads(counter, true));
        Thread t2 = new Thread(new Threads(counter, false));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        Thread.sleep(2000);
        System.out.println(counter.getValue());
    }
}
