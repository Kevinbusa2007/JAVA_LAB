import java.util.Scanner;

public class tollbooth {

    record Vehicle(String number, String type) {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int bike = 0;
        int car = 0;
        int truck = 0;

        while (true) {

            System.out.print("Enter vehicle number: ");
            String number = sc.next();

            if (number.equals("done")) {
                break;
            }

            System.out.print("Enter vehicle type: ");
            String type = sc.next().toLowerCase();

            Vehicle v = new Vehicle(number, type);

            int toll = switch (v.type()) {
                case "bike" -> 20;
                case "car" -> 50;
                case "truck" -> 150;
                default -> 0;
            };

            total = total + toll;

            if (type.equals("bike")) {
                bike++;
            } else if (type.equals("car")) {
                car++;
            } else if (type.equals("truck")) {
                truck++;
            }
        }

        String mostFrequent;

        if (bike >= car && bike >= truck) {
            mostFrequent = "bike";
        } else if (car >= bike && car >= truck) {
            mostFrequent = "car";
        } else {
            mostFrequent = "truck";
        }

        System.out.println("Total toll: " + total);
        System.out.println("Most frequent: " + mostFrequent);

        sc.close();
    }
}