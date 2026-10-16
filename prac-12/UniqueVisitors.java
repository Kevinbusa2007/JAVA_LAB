
import java.util.*;

class UniqueVisitors {
    public static void main(String[] args) {
        String[] names = {"Kevin", "Om", "Rutvik", "Kevin", "Om", "Amit"};

        HashSet<String> set = new HashSet<>();
        LinkedHashSet<String> list = new LinkedHashSet<>();

        for (String name : names) {
            set.add(name);
            list.add(name);
        }

        System.out.println("Unique visitors: " + set.size());

        System.out.println("First three distinct names:");
        int count = 0;

        for (String name : list) {
            if (count == 3)
                break;

            System.out.println(name);
            count++;
        }
    }
}
