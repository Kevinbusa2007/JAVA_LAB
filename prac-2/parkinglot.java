public class parkinglot {

    private int twoWheelers;
    private int fourWheelers;
    private final int twoCap;
    private final int fourCap;
    private static long revenue = 0;

    public parkinglot(int twoCap, int fourCap) {
        this.twoCap = twoCap;
        this.fourCap = fourCap;
    }

    public void park(String type) {
        if (type.equals("two")) {
            if (twoWheelers < twoCap) {
                twoWheelers++;
                revenue += 20;
                System.out.println("Two-wheeler parked");
            } else {
                System.out.println("Full");
            }
        } else if (type.equals("four")) {
            if (fourWheelers < fourCap) {
                fourWheelers++;
                revenue += 40;
                System.out.println("Four-wheeler parked");
            } else {
                System.out.println("Full");
            }
        }
    }

    public void leave(String type) {
        if (type.equals("two") && twoWheelers > 0) {
            twoWheelers--;
            System.out.println("Two-wheeler left");
        } else if (type.equals("four") && fourWheelers > 0) {
            fourWheelers--;
            System.out.println("Four-wheeler left");
        }
    }

    public static void main(String[] args) {

        parkinglot p = new parkinglot(2, 2);

        p.park("two");
        p.park("two");
        p.park("two");

        p.park("four");
        p.park("four");
        p.park("four");

        p.leave("two");
        p.park("two");

        System.out.println("Two-wheelers: " + p.twoWheelers);
        System.out.println("Four-wheelers: " + p.fourWheelers);
        System.out.println("Revenue: " + revenue);
    }
}