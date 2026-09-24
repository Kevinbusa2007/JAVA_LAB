class thermostat{
    private String location;
    private int temperature;
    private static final int MIN=16;
    private static final int MAX=30;   
    private static int activecount=0;

    thermostat(String location,int starttemp) {
        
            this.location=location;
            if(starttemp>=MIN && starttemp<=MAX)
            {
                temperature=starttemp;
            }
            else{
                temperature=22;
            }
            activecount++;
    }

    thermostat(String location) {
        this(location,22);    
    }

    void raise()
    {
        if(temperature<MAX)
        {
            temperature+=temperature;
        }
        else{
            System.out.println("Already at maximum (30)");
        }
    }
    void lower()
    {
        if(temperature>MIN)
        {
            temperature-=temperature;
        }
        else{
            System.out.println("Already at minimum (16)");
        }
    }
    int gettemperature()
    {
        return temperature;
    }
    static int getactivecount()
    {
        return activecount;
    }

    public static void main(String args[])
    {
        thermostat t1 =new thermostat("room 1",20);
        thermostat t2 =new thermostat("room 2");

        for(int i=1;i<=10;i++)
        {
            t1.raise();
            System.out.println("Tem"+t1.gettemperature());
        if (t1.gettemperature() == 30) 
        {
            break; 
        }
        }
        for(int i=1;i<=20;i++)
        {
            t1.lower();
            System.out.println("Tem"+t1.gettemperature());
            if (t1.gettemperature() == 16) 
        {
            break; 
        }
        }
       System.out.println("Active thermo"+thermostat.getactivecount());
    }
}