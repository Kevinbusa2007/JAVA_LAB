
import java.util.concurrent.atomic.AtomicInteger;

class ArraySum {
    static int total = 0;
    static AtomicInteger safeTotal = new AtomicInteger(0);

    static void add(int[] a, int start, int end) {
        for (int i = start; i < end; i++) {
            total += a[i];
        }
    }

    static synchronized void addSync(int value) {
        total += value;
    }

    static void addAtomic(int value) {
        safeTotal.addAndGet(value);
    }

    public static void main(String[] args) throws Exception {
        int[] a = new int[100000];

        for (int i = 0; i < a.length; i++) {
            a[i] = 1;
        }

        Thread[] t = new Thread[4];

        total = 0;
        for (int i = 0; i < 4; i++) {
            final int start = i * 25000;
            final int end = start + 25000;

            t[i] = new Thread(() -> add(a, start, end));
            t[i].start();
        }

        for (Thread x : t) x.join();
        System.out.println("Without synchronization: " + total);

        total = 0;
        for (int i = 0; i < 4; i++) {
            final int start = i * 25000;
            final int end = start + 25000;

            t[i] = new Thread(() -> {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += a[j];
                }
                addSync(sum);
            });
            t[i].start();
        }

        for (Thread x : t) x.join();
        System.out.println("With synchronized: " + total);

        for (int i = 0; i < 4; i++) {
            final int start = i * 25000;
            final int end = start + 25000;

            t[i] = new Thread(() -> {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += a[j];
                }
                addAtomic(sum);
            });
            t[i].start();
        }

        for (Thread x : t) x.join();
        System.out.println("With AtomicInteger: " + safeTotal);
    }
}