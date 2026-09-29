import java.util.Scanner;

class DivideByZeroException extends Exception
{
    DivideByZeroException(String message)
    {
        super(message);
    }
}

class guardedcalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean success = false;

        while(!success)
        {
            try
            {
                System.out.print("Enter A = ");
                int a = Integer.parseInt(sc.nextLine());

                System.out.print("Enter B = ");
                int b = Integer.parseInt(sc.nextLine());

                System.out.print("Enter operator (+, -, *, /) = ");
                String op = sc.nextLine();

                int result = 0;

                switch(op)
                {
                    case "+":
                        result = a + b;
                        break;

                    case "-":
                        result = a - b;
                        break;

                    case "*":
                        result = a * b;
                        break;

                    case "/":
                        if(b == 0)
                        {
                            throw new DivideByZeroException("Cannot Divide by Zero");
                        }
                        result = a / b;
                        break;

                    default:
                        System.out.println("Invalid Operator");
                        continue;
                }

                System.out.println("Result = " + result);
                success = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid Number Input");
            }
            catch(DivideByZeroException e)
            {
                System.out.println(e.getMessage());
            }
            finally
            {
                System.out.println("Attempt Logged");
            }
        }

        sc.close();
    }
}