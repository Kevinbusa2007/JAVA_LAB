import java.util.Scanner;
enum money{
    ONE,
    TWO,
    FIVE,
    TEN
}
public class vending{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the money");
        String input = sc.next();
        money m = money.valueOf(input.toUpperCase());
        String result = switch(m){
            case ONE -> "1";
            case TWO -> "2";
            case FIVE -> "5";
            case TEN -> "10";
        };
        System.out.println(result);
        sc.close();
        for(int i=1;i<m;i++)
        {
            m=20-m;
        }
    }
}