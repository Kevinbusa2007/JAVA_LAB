import java.util.Scanner;
enum day{
    MONDAY,
    TUESDAY,
    WEDNESDAY
}
public class p2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        String input = sc.next().toUpperCase();
        day d = day.valueOf(input);
        String result = switch(d){
            case MONDAY -> "Today is Monday";
            case TUESDAY -> "Today is Tuesday";
            case WEDNESDAY -> "Today is Wednesday";
        };
        System.out.println(result);
        sc.close();
    }
}