abstract class employee
{
    abstract void monthlysalary();
    String name;
    int id;
    employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class fulltime extends employee
{
    int fixed;
    fulltime(String name, int id,int fixed)
    {
        // this.name = name;
        // this.id = id;
        super(name, id);
        this.fixed=fixed;
    }
    void monthlysalary()
    {
        System.out.println("Fulltime = "+fixed);
        payroll.total += fixed; 
    }
}
class parttime extends employee
{
    int hours,rate;
    parttime(String name, int id,int hours,int rate)
    {
        // this.name = name;
        // this.id = id;
        super(name, id);
        this.hours=hours;
        this.rate=rate;
    }
    void monthlysalary()
    {
        System.out.println("Parttime = "+(hours*rate));
        payroll.total += hours * rate;
    }
}
class intern extends employee
{
    int stipend;
    intern(String name, int id,int stipend)
    {
        // this.name = name;
        // this.id = id;
        super(name, id);
        this.stipend=stipend;
    }
    void monthlysalary()
    {
        System.out.println("Intern = "+stipend);
        payroll.total += stipend;
    }
}

public class payroll
{
    static double total=0;
    public static void main(String[] args) {
        employee[] e={
            new fulltime("kevin",10,2),
            new parttime("kevin",10,2,7),
            new intern("kevin",10,2),
        };
        for(employee e1:e)
        {
            e1.monthlysalary();
        }
         System.out.println("Total = " + total);
    }
}