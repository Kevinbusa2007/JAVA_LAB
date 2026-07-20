
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF A");
        int a = sc.nextInt();
        System.out.print("ENTER THE VALUE OF B");
        int b = sc.nextInt();

        Addition add= new Addition(a,b);
        Subtraction sub=new Subtraction(a,b);
        Multiplication mul=new Multiplication(a,b);
        Division div=new Division(a,b);

        System.out.println("Addition of" + a + "and" + b + "is" +  add.addition());
        System.out.println("Multiplication of" + a + "and" + b + "is" +  mul.multiplication());
        System.out.println("Subtraction of" + a + "and" + b + "is" +  sub.subtraction());
        System.out.println("Division of" + a + "and" + b + "is" +  div.division()); 
    }
}