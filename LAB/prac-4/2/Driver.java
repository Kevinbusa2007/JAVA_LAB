import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        String[] lines = {
            "10:05 alice Hello there",
            "10:06 bob How are you",
            "10:07",
            "10:08 john Good morning"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();

        ChatFilter.filter(lines, keyword);

        sc.close();
    }
}