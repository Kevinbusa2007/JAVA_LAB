
class DeadlockDemo {
    static Object account1 = new Object();
    static Object account2 = new Object();

    static void deadlock() {
        Thread t1 = new Thread(() -> {
            synchronized (account1) {
                System.out.println("Thread 1 locked Account 1");
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (account2) {
                    System.out.println("Thread 1 locked Account 2");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (account2) {
                System.out.println("Thread 2 locked Account 2");
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (account1) {
                    System.out.println("Thread 2 locked Account 1");
                }
            }
        });

        t1.start();
        t2.start();
    }

    static void fixed() {
        Thread t1 = new Thread(() -> {
            synchronized (account1) {
                synchronized (account2) {
                    System.out.println("Thread 1 completed");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (account1) {
                synchronized (account2) {
                    System.out.println("Thread 2 completed");
                }
            }
        });

        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        System.out.println("Deadlock example:");
        deadlock();

        try { Thread.sleep(1000); } catch (Exception e) {}

        System.out.println("\nFixed example:");
        fixed();
    }
}
