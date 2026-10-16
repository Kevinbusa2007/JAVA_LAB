
import java.util.*;

class Leaderboard {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Kevin", 90);
        scores.put("Om", 85);
        scores.put("Amit", 95);
        scores.put("Rutvik", 90);
        scores.put("Raj", 80);

        List<String> players = new ArrayList<>(scores.keySet());

        Collections.sort(players, new Comparator<String>() {
            public int compare(String a, String b) {
                if (scores.get(a).equals(scores.get(b))) {
                    return a.compareTo(b);
                }
                return scores.get(b) - scores.get(a);
            }
        });

        System.out.println("Top 3 Players:");

        for (int i = 0; i < 3; i++) {
            String name = players.get(i);
            System.out.println(name + " : " + scores.get(name));
        }
    }
}
