class rectangle
{
    int len,bre;
    rectangle(int x, int y)
    {
        len=x;
        bre=y;
    }
}
class calc
{
    public static void main(String args[])
{
    rectangle r = new rectangle(5, 3);
    calc c = new calc();
    int area = c.area(r);
    int peri = c.peri(r);
    System.out.println("Area" + area + " and perimeter of rectangle is " + peri);
}
    int area(rectangle r)
    {
        return r.len*r.bre;
    }
    int peri(rectangle r)
    {
        return 2*(r.len+r.bre);
    }
}
