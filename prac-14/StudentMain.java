
import java.util.*;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class StudentService {
    ArrayList<Student> list = new ArrayList<>();

    void add(String name) {
        list.add(new Student(name));
    }

    int count() {
        return list.size();
    }

    void action(String a) {
        if (!a.equals("add") && !a.equals("count"))
            throw new IllegalArgumentException("Invalid action");
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService s = new StudentService();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Show Count");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter name: ");
                s.add(sc.nextLine());
            } else if (ch == 2) {
                System.out.println("Total Students: " + s.count());
            } else if (ch == 3) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
