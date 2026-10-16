
class Box<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

class Pair<A, B> {
    A first;
    B second;

    Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    void display() {
        System.out.println(first + " " + second);
    }
}

class GenericContainers {
    static <T> T first(T[] arr) {
        return arr[0];
    }

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.set(10);
        System.out.println("Box: " + b1.get());

        Box<String> b2 = new Box<>();
        b2.set("Java");
        System.out.println("Box: " + b2.get());

        Pair<String, Integer> p = new Pair<>("Kevin", 20);
        System.out.print("Pair: ");
        p.display();

        String[] names = {"Kevin", "Om", "Amit"};
        System.out.println("First element: " + first(names));

        Integer[] nums = {10, 20, 30};
        System.out.println("First number: " + first(nums));
    }
}
