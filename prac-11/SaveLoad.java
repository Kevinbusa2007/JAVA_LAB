
import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    transient String password;

    Student(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

class SaveLoad {
    public static void main(String[] args) throws Exception {
        Student[] s = {
            new Student(1, "Kevin", "abc"),
            new Student(2, "Rahul", "xyz")
        };

        try (ObjectOutputStream out =
                 new ObjectOutputStream(new FileOutputStream("student.dat"))) {
            out.writeObject(s);
        }

        try (ObjectInputStream in =
                 new ObjectInputStream(new FileInputStream("student.dat"))) {
            Student[] data = (Student[]) in.readObject();

            for (Student x : data) {
                System.out.println(x.id + " " + x.name + " " + x.password);
            }
        }
    }
}
