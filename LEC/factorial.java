import java.util.Scanner;
public class factorial
{
    public static void main(String args[])
    {
        int n,i,a=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num: ");
        n = sc.nextInt();
        for (i = 1;i<=n;i++) 
        {
            a=a*i;
        }
        System.out.println("FACT :" + a);
    }
}