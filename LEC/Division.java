public class Division {

int a1,b1;
        Division(int a,int b) {
        System.out.println("Division CONSTRUCTOR");
        a1=a;
        b1=b;
    }

    
    double division() {
        
        return (double) a1 / b1;
    }   
}