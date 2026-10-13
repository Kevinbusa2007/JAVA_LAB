import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Column {
    String name();
}

class Student {
    @Column(name = "id")
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "city")
    String city;

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", City: " + city;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        String[] header = {"id", "name", "city"};
        String[] data = {"101", "Kevin", "Ahmedabad"};

        Student s = new Student();

        for (Field field : Student.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Column.class)) {

                Column column = field.getAnnotation(Column.class);
                String columnName = column.name();

                for (int i = 0; i < header.length; i++) {
                    if (header[i].equals(columnName)) {

                        field.setAccessible(true);

                        if (field.getType() == int.class)
                            field.setInt(s, Integer.parseInt(data[i]));
                        else
                            field.set(s, data[i]);

                        break;
                    }
                }
            }
        }

        System.out.println(s);
    }
}