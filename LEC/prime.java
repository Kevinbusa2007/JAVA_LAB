import java.util.Scanner;
public class prime
{
    public static void main(String args[])
    {
        int i,n,flag=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter th num: ");
        n=sc.nextInt();

        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("NUM IS NOT PRIME");
        }
        else{
            System.out.println("NUM IS PRIME");
        }
    }
}