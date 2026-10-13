import java.util.Scanner;

enum coin{
    ONE,
    TWO,
    FIVE,
    TEN
}

public class vending{

    public static void main(String[] args) {
        int price=15,total=0;

        Scanner sc=new Scanner(System.in);
        
        while(total<=price)
        {
            System.out.println("Enter coin: ");
            String input=sc.next().toUpperCase();
            coin obj=coin.valueOf(input);

            int value = switch(obj)
            {
                case ONE -> 1;
                case TWO ->2;
                case FIVE ->5;
                case TEN -> 10;
            };

            total+=value;
            System.out.println("Total="+total);
        }
        int change=total-price;
        System.out.println("Change"+change);

        sc.close();
    }
}