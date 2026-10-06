public class CinemaShow {
    private String title;
    private int seatsAvailable;
    private final int capacity;

    private static int totalBooked = 0;

    public CinemaShow(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.seatsAvailable = capacity;
    }

    public CinemaShow(String title) {
        this(title, 100);
    }

    public boolean book(int n) {
        if (n <= seatsAvailable) {
            seatsAvailable -= n;
            totalBooked += n;
            return true;
        }
        return false;
    }

    public boolean cancel(int n) {
        if (seatsAvailable + n <= capacity) {
            seatsAvailable += n;
            totalBooked -= n;
            return true;
        }
        return false;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public static int getTotalBooked() {
        return totalBooked;
    }

    public static void main(String[] args) {
        CinemaShow show = new CinemaShow("Avengers", 100);

        System.out.println(show.book(60));
        System.out.println("Seats: " + show.getSeatsAvailable());

        System.out.println(show.book(50));
        System.out.println("Seats: " + show.getSeatsAvailable());

        System.out.println(show.cancel(20));
        System.out.println("Seats: " + show.getSeatsAvailable());

        System.out.println("Total Booked: " + getTotalBooked());
    }
}