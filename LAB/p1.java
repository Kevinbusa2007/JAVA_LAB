import java.util.Scanner;
public class p1{
    public static void main(String[] args) {
    int n,i,f=0;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(i=2;i<=n;i++)
    {
        if(n%i!=0)
        {
            f=1;
            break;
        }
    }
    if(f==0)
    {
        System.out.println("PRIME");
    }
    else
    {
        System.out.println("NOT PRIME");
    }
}
}