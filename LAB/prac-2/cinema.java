class cinema{
    private String title;
    private int seatsAvailable;
    private final int capacity;
    private static int totalBooked=0;

    cinema(String title,int capacity)
    {
        this.title=title;
        this.capacity=capacity;
        this.seatsAvailable=capacity;
    }
    cinema(String title)
    {
        this(title,100);
    }
    int book(int n)
    {
        if(n<=seatsAvailable)
        {
            seatsAvailable-=n;
            totalBooked+=n;
            return 1;
        }
        else{
            return 0;
        }
    }
    void  cancel(int n)
    {
        seatsAvailable+=n;
        if(seatsAvailable>capacity)
        {
            seatsAvailable=capacity;
        }
    }
    int getseatavailable()
    {
        return seatsAvailable;
    }
    static int gettotalbook()
    {
        return totalBooked;
    }

    public static void main(String args[])
    {
        cinema m1 = new cinema("AVENGERS",50);
        System.out.println("Book 10: " + m1.book(10)); 
        System.out.println("Seats: " + m1.getseatavailable());
        
        System.out.println("Total Booked: " + cinema.gettotalbook());
    }
}