import java.util.Scanner;
public class array{
    public static void main(String[] args){
        int a[]=new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(a[i]%4==0)
            {
                a[i]=a[i]*5;
            }
        }
        
        for(int i=0;i<10;i++)
        {
            System.out.println("array" + a[i]);
        }
}
}