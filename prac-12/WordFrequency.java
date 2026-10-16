import java.util.*;

class WordFrequency {
    public static void main(String[] args) {
        String str = "java is easy java is useful java";

        String[] words = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                return map.get(b) - map.get(a);
            }
        });

        for (String word : list) {
            System.out.println(word + " : " + map.get(word));
        }
    }
}