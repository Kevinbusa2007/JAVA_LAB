class Counter {
    int count = 0;

    void increment() {
        count++;
    }

    synchronized void syncIncrement() {
        count++;
    }
}

public class CounterRace {

    public static void main(String[] args) throws Exception {

        Counter c1 = new Counter();
        Thread[] t1 = new Thread[10];

        for (int i = 0; i < 10; i++) {
            t1[i] = new Thread(() -> {
                for (int j = 0; j < 10000; j++)
                    c1.increment();
            });
            t1[i].start();
        }

        for (Thread t : t1)
            t.join();

        System.out.println("Without synchronization: " + c1.count);

        Counter c2 = new Counter();
        Thread[] t2 = new Thread[10];

        for (int i = 0; i < 10; i++) {
            t2[i] = new Thread(() -> {
                for (int j = 0; j < 10000; j++)
                    c2.syncIncrement();
            });
            t2[i].start();
        }

        for (Thread t : t2)
            t.join();

        System.out.println("With synchronization: " + c2.count);
    }
}