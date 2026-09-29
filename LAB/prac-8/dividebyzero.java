import java.util.Scanner;

class dividebyzero
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter A= ");
    int a = sc.nextInt();
    System.out.print("Enter B= ");
    int b = sc.nextInt();

        try
        {
            int result=a/b;
            System.err.println(result);
        }
        catch(ArithmeticException e)
        {
            System.err.println("Cannot Divide by Zero");
        }
        
    }
} 