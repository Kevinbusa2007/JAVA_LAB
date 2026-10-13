import java.util.*;

interface DiscountRule {
    double apply(double price);
}

public class discountengine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Double> prices = Arrays.asList(1000.0, 2000.0, 3000.0);

        System.out.println("1. 10% Discount");
        System.out.println("2. 20% Discount");
        System.out.println("3. No Discount");
        System.out.print("Choose rule: ");

        int choice = sc.nextInt();

        DiscountRule rule;

        if (choice == 1) {
            rule = price -> price - (price * 0.10);
        } else if (choice == 2) {
            rule = price -> price - (price * 0.20);
        } else {
            rule = price -> price;
        }

        System.out.println("Discounted Prices:");

        for (double price : prices) {
            System.out.println(rule.apply(price));
        }

        sc.close();
    }
}