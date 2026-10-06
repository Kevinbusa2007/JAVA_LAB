class OutOfStockException extends Exception
{
    int shortfall;

    OutOfStockException(int s)
    {
        shortfall = s;
    }
}

class InvalidQuantityException extends Exception
{
    InvalidQuantityException(String msg)
    {
        super(msg);
    }
}

class Warehouse
{
    int stock = 10;

    void issue(String item, int qty)
        throws OutOfStockException, InvalidQuantityException
    {
        if(qty <= 0)
            throw new InvalidQuantityException("Invalid quantity");

        if(qty > stock)
            throw new OutOfStockException(qty - stock);

        stock -= qty;
        System.out.println("Issued " + qty + " " + item);
    }
}

class stockissue
{
    public static void main(String[] args)
    {
        Warehouse w = new Warehouse();

        try
        {
            w.issue("Pen", 3);
            w.issue("Book", 5);
            w.issue("Pen", 10);
            w.issue("Pen", 0);
        }
        catch(OutOfStockException e)
        {
            System.out.println("Out of stock, Shortfall = " + e.shortfall);
        }
        catch(InvalidQuantityException e)
        {
            System.out.println(e.getMessage());
        }
    }
}