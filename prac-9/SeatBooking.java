class SeatBooking {
    static int seatsLeft = 5;

    static void book() {
        if (seatsLeft > 0) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            seatsLeft--;
            System.out.println("Seat booked");
        }
    }

    static synchronized void bookSync() {
        if (seatsLeft > 0) {
            seatsLeft--;
            System.out.println("Seat booked");
        }
    }

    public static void main(String[] args) throws Exception {
        Thread[] t = new Thread[10];

        System.out.println("Without Synchronization:");
        seatsLeft = 5;

        for (int i = 0; i < 10; i++) {
            t[i] = new Thread(() -> book());
            t[i].start();
        }

        for (int i = 0; i < 10; i++) {
            t[i].join();
        }

        System.out.println("Seats left: " + seatsLeft);

        System.out.println("\nWith Synchronization:");
        seatsLeft = 5;

        for (int i = 0; i < 10; i++) {
            t[i] = new Thread(() -> bookSync());
            t[i].start();
        }

        for (int i = 0; i < 10; i++) {
            t[i].join();
        }

        System.out.println("Seats left: " + seatsLeft);
    }
}