
import java.util.Scanner;

public class fibonaci
{
    public static void main(String arrgs[])
    {
        int i,n,a=0,b=1,c;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num :");
        n=sc.nextInt();

        for(i=1;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("FIBONACI" + a ); 
    }
}