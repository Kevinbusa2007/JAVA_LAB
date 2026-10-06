abstract class shape
{
    abstract void area();
}
class circle extends shape{
    int r;
    circle(int r)
    {
        this.r=r;
    }
    void area()
    {
        System.out.println("Area of Circle= "+(3.14*r*r));
    }
}
class rectangle extends shape{
    int l,b;
    rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    void area()
    {
        System.out.println("Area of Rectangle= "+(l*b));
    }
}
class triangle extends shape{
    int l,b;
    triangle(int l,int b) 
    {
        this.l=l;
        this.b=b;
    }
    
    void area()
    {
        System.out.println("Area of Triangle= "+((l*b)/2));
    }
}

public class shapearea
{
    public static void main(String[] args) {
        shape[] a={
            new circle(2),
            new rectangle(2,2),
            new triangle(2,2),
        };
        for(shape a1:a)
        {
            a1.area();
        }
    }
}