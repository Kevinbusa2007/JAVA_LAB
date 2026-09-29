
public class pass {

    int check(String pw) {
        int count = 0;

        if (pw.length() >= 8) {
            count++;
        }

        if (pw.matches(".*[A-Z].*")) {
            count++;
        }

        if (pw.matches(".*[0-9].*")) {
            count++;
        }

        if (pw.matches(".*[!@#$%^&*].*")) {
            count++;
        }
        if (count == 1)
            {System.out.println("weak");}
        else if (count == 3 || count == 2)
            {System.out.println("medium");}
        else
            {System.out.println("Strong");}
    }
}
