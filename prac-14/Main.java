import java.io.*;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class StudentService {
    void save(Student s) throws Exception {
        FileWriter f = new FileWriter("student.txt");
        f.write(s.name);
        f.close();
    }

    Student load() throws Exception {
        BufferedReader br = new BufferedReader(
            new FileReader("student.txt"));
        String name = br.readLine();
        br.close();

        return new Student(name);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Student s = new Student("Kevin");

        StudentService service = new StudentService();
        service.save(s);

        Student s2 = service.load();

        if (s.name.equals(s2.name)) {
            System.out.println("Test Passed");
            System.out.println("Student Name: " + s2.name);
        } else {
            System.out.println("Test Failed");
        }
    }
}